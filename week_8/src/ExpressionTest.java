public class ExpressionTest {
    public static void main(String[] args) {
        Expression e = new Square(new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(-3)), new Division(new Numeral(5), new Numeral(-3))));
        System.out.println(e.toString() + " = " + e.evaluate());

        // try {
        //     double value = 2 / 0;
        //     System.out.prdoubleln("New value = " + value);
        // } catch (ArithmeticException e) {
        //     // Các dòng code trong khối catch được thực thi
        //     System.out.prdoubleln("An exception");
        //     System.out.prdoubleln("Error: " + e.getMessage());
        // }
        // // Dòng code dưới đây chắc chắn sẽ được thực hiện
        // System.out.prdoubleln("Exit!");
    }
    
}
