import java.util.ArrayList;
import java.util.List;

public class Week10 {

    private String packageString = "";
    private ArrayList<String> importList = new ArrayList<String>();
    private ArrayList<String> classList = new ArrayList<String>();
    private ArrayList<String> methodList = new ArrayList<String>();

    /**
     * handlePackage.
     */
    private void handlePackage(String line) {
        String[] tokens = line.split(" ");
        packageString = tokens[tokens.length - 1].replace(";", "");
    }

    /**
     * handleImport.
     */
    private void handleImport(String line) {
        String[] tokens = line.split(" ");
        importList.add(tokens[tokens.length - 1].replace(";", ""));
    }

    /**
     * handleClass.
     */
    private void handleClass(String line) {
        int index = line.indexOf("class") + 6;
        int index2 = line.indexOf(" ", index);
        if (index2 == -1) {
            return;
        }
        String className = line.substring(index, index2).trim();
        String[] tokens = className.split("<");
        classList.add(packageString + "." + tokens[0]);
    }

    /**
     * handleParameters.
     */
    private String handleParameters(String line) {
        if (line.contains("...")) {
            return fixImportString(line.replace("...", ""));
        }
        if (line.contains("[]")) {
            int index = line.indexOf("[]");
            return fixImportString((line.replace("[]", ""))) 
                                + line.substring(index);
        }
        if (!line.contains("<")) {
            return fixImportString(line);
        }

        int index = line.indexOf("<");
        String fix = fixImportString(line.substring(0, index)) + "<";
        String[] list = line.substring(index + 1, line.length() - 1).split(",");
        for (int i = 0; i < list.length; i++) {
            if (i != 0) {
                fix = fix.concat(",");
            }
            if (list[i].startsWith("?")) {
                fix = fix.concat(list[i]);
            } else {
                fix = fix + fixImportString(list[i]);
            }
        }
        return fix.concat(">");
    }

    /**
     * handleStatic.
     */
    private void handleStatic(String line) {
        if (line.contains("=")) {
            return;
        }
        int index = line.indexOf("(");
        int index2 = line.indexOf(")", index + 1);
        if (index2 == -1 || index == -1) {
            return;
        }
        String methodName = line.substring(line.substring(0, index)
                                .lastIndexOf(" ") + 1, index);
        if (index2 - index == 1) {
            methodList.add(methodName.concat("()"));
            return;
        }
        String fixString = methodName + "(";
        String params = line.substring(index + 1, index2);
        String[] list = params.split(", ");
        for (int i = 0; i < list.length; i++) {
            if (i != 0) {
                fixString = fixString.concat(",");
            }
            String str = list[i].substring(0, list[i].lastIndexOf(" "))
                    .replace("final ", "").trim();
            String param = handleParameters(str);
            fixString = fixString.concat(param);
        }
        fixString = fixString.concat(")");
        methodList.add(fixString);
    }

    /**
     * fixImportString.
     */
    private String fixImportString(String str) {
        for (String s : importList) {
            if (s.endsWith("." + str)) {
                return s;
            }
        }

        for (String s : classList) {
            if (s.endsWith(str)) {
                return s;
            }
        }

        if (str.charAt(0) >= 'A' 
            && str.charAt(0) <= 'Z' 
            && str.length() > 1) {
            return "java.lang." + str;
        }
        return str;
    }

    /**
     * setFileContentToOneLine.
     */
    private String setFileContentToOneLine(String fileContent) {
        StringBuilder sb = new StringBuilder(fileContent);
        int index = sb.indexOf("(");

        while (index != -1) {
            int index2 = sb.indexOf(")", index);
            for (int i = index2; i > index; i--) {
                if (sb.charAt(i) == '\n') {
                    sb.deleteCharAt(i);
                }
            }
            index = sb.indexOf("(", index + 2);
        }

        return sb.toString();
    }

    /**
     * removeAllComments.
     */
    private String removeAllComments(String fileContent) {
        StringBuilder sb = new StringBuilder(fileContent);
        int index = sb.indexOf("//");
        while (index != -1) {
            int index2 = sb.indexOf("\n", index);
            if (index2 == -1) {
                sb.delete(index, sb.length());
                break;
            }
            sb.delete(index, index2);
            index = sb.indexOf("//");
        }

        index = sb.indexOf("/*");
        while (index != -1) {
            int index2 = sb.indexOf("*/", index);
            if (index2 == -1) {
                break;
            }
            sb.delete(index, index2 + 3);
            index = sb.indexOf("/*");
        }
        return sb.toString();
    }

    /**
     * getAllFunctions.
     */
    public List<String> getAllFunctions(String fileContent) {
        String temp = removeAllComments(setFileContentToOneLine(fileContent));
        String str = temp.replace("{", "{\n");
        String[] lines = str.split("\n");
        List<String> staticCode = new ArrayList<>();
        for (String line : lines) {
            if (line.startsWith("import")) {
                handleImport(line);
            } else if (line.startsWith("package")) {
                handlePackage(line);
            } else if (line.contains("class")) {
                handleClass(line);
            } else if (line.contains("static")) {
                staticCode.add(line);
            } else if (line.contains("enum")) {
                handleClass(line.replace("enum", "class"));
            } else if (line.contains("interface")) {
                handleClass(line.replace("interface", "class"));
            }
        }
        for (String method : staticCode) {
            handleStatic(method);
        }
        return methodList;
    }
}