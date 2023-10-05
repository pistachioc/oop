// Import your library
// Do not change the name of the Solution class
public class Fibonacci {
    
    /** phuong thuc tinh fibonacci. */ 
    public long fibonacci(long n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long fibprev = 0;
            long fibcurr = 1;
            long fibnext = 0;

            for (int i = 2; i <= n; i++) {
                fibnext = fibprev + fibcurr;

                if (fibnext < 0) {
                    return Long.MAX_VALUE;
                }

                fibprev = fibcurr;
                fibcurr = fibnext;
            }

            return fibcurr;
        }
    }
} 