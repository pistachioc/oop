import java.io.FileNotFoundException;

public class Week8Task2 {
    
    /**
     * Throws a NullPointerException.
     */
    public void nullPointerEx() {
        String string = null;
        int length = string.length();
    }

    /**
     * Tests the nullPointerEx.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * Throws an ArrayIndexOutOfBoundsException.
     */
    public void arrayIndexOutOfBoundsEx() {
        int[] array = new int[5];
        array[5] = 12;
    }

    /**
     * Tests the arrayIndexOutOfBoundsEx.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * Throws an ArithmeticException.
     */
    public void arithmeticEx() {
        int a = 5 / 0;
    }

    /**
     * Tests the arithmeticEx.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * Throws a FileNotFoundException.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        java.io.File file = new java.io.File("fdasfsdaf.txt");
        java.util.Scanner input = new java.util.Scanner(file);
    }

    /**
     * Tests the fileNotFoundEx.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * Throws a IOException.
     */
    public void ioEx() throws java.io.IOException {
        java.io.BufferedReader reader
                = new java.io.BufferedReader(new java.io.FileReader("fdsafdsafdsa.txt"));
        String line = reader.readLine();
        reader.close();
    }

    /**
     * Tests the ioEx.
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (java.io.IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }

}
