import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.Instant;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawlerThreaded {

    private Map<String, Integer> visitedUrls;
    private Deque<String> urlsQueue;
    private Instant startTime;
    private final int maxDepth = 4;
    private final int maxUrlsPerPage = 10;
    private final int numThreads = 10; // Số luồng

    public WebCrawlerThreaded(Instant start) {
        visitedUrls = new ConcurrentHashMap<>();
        urlsQueue = new LinkedList<>();
        startTime = start;
    }

    public void crawl(String rootUrl) {
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        urlsQueue.addLast(rootUrl);
        visitedUrls.put(rootUrl, 1);

        while (!urlsQueue.isEmpty()) {
            String url = urlsQueue.removeFirst();
            int depth = visitedUrls.get(url);

            if (depth < maxDepth) {
                executorService.execute(() -> {
                    try {
                        URL urlObject = new URL(url);
                        BufferedReader in = new BufferedReader(new InputStreamReader(urlObject.openStream()));
                        String inputLine = in.readLine();
                        String rawHtml = "";

                        while (inputLine != null) {
                            rawHtml += inputLine;
                            inputLine = in.readLine();
                        }

                        in.close();
                        parseAndAddUrls(rawHtml, depth);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
            // Chờ tất cả các luồng kết thúc
        }

        Instant endTime = Instant.now();
        long totalTime = endTime.toEpochMilli() - startTime.toEpochMilli();
        System.out.println("Visited " + visitedUrls.size() + " Urls in " + totalTime + " ms");
    }

    private void parseAndAddUrls(String rawHtml, int depth) {
        String urlPattern = "((\\/wiki\\/)+[^\\s\\.\\#\\:\"]+[\\w])\"";
        Pattern pattern = Pattern.compile(urlPattern);
        Matcher matcher = pattern.matcher(rawHtml);

        int cntUrlsPerPage = 0;

        while (matcher.find()) {
            String newUrl = matcher.group(1);
            newUrl = "https://en.wikipedia.org" + newUrl;

            if (!visitedUrls.containsKey(newUrl)) {
                urlsQueue.addLast(newUrl);
                visitedUrls.put(newUrl, depth + 1);
                cntUrlsPerPage += 1;

                if (cntUrlsPerPage >= maxUrlsPerPage) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Instant start = Instant.now();
        WebCrawlerThreaded crawler = new WebCrawlerThreaded(start);
        crawler.crawl("https://en.wikipedia.org/wiki/Travelling_salesman_problem");
    }
}
