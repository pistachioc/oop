public class GCD {
    /** calculate gcd. */
    public int gcd(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }

        return Math.abs(a);
    }
}
