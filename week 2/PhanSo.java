public class PhanSo {
    private int numerator;
    private int denominator;

    /**
     * contructor cua phan so.
     * 
     * @param numerator   tu so
     * @param denominator mau so
     */
    public PhanSo(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (this.denominator == 0) {
            this.denominator = 1;
        }
    }

    public PhanSo(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    /**
     * get tu so.
     * 
     * @return gia tri tu so
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * set tu so.
     * 
     * @param numerator gia tri muon dat cho tu so
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * get mau so.
     * 
     * @return gia tri mau so
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * set mau so.
     * 
     * @param denominator gia tri muon dat cho mau so
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * tim gcd dua vao Euclid.
     * 
     * @param a so hang dau
     * @param b so hang tiep
     * @return uoc chung lon nhat
     */
    public int gcd(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }

        return Math.abs(a);
    }

    /**
     * rut gon phan so.
     * 
     */
    public PhanSo reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        return this;
    }

    /**
     * cong 2 phan so.
     * 
     * @param other phan so con lai
     * @return tong cua 2 phan so
     */
    public PhanSo add(PhanSo other) {
        this.numerator = this.numerator * other.getDenominator()
                + other.getNumerator() * this.denominator;
        this.denominator *= other.getDenominator();
        return this;
    }

    /**
     * tru 2 phan so.
     * 
     * @param other phan so con lai
     * @return hieu cua 2 phan so
     */
    public PhanSo subtract(PhanSo other) {
        this.numerator = this.numerator * other.getDenominator()
                - this.denominator * other.getNumerator();
        this.denominator *= other.getDenominator();
        return this;
    }

    /**
     * nhan 2 phan so.
     * 
     * @param other phan so con lai
     * @return tich cua 2 phan so
     */
    public PhanSo multiply(PhanSo other) {
        this.numerator *= other.getNumerator();
        this.denominator *= other.getDenominator();
        return this;
    }

    /**
     * chia 2 phan so.
     * 
     * @param other phan so con lai
     * @return thuong cua 2 phan so
     */
    public PhanSo divide(PhanSo other) {
        if (other.getNumerator() == 0) {
            return this;
        }
        this.numerator *= other.getDenominator();
        this.denominator *= other.getNumerator();
        return this;
    }

    /**
     * so sanh 2 phan so.
     * 
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof PhanSo)) {
            return false;
        }
        PhanSo other = (PhanSo) obj;
        return this.numerator * other.getDenominator()
                - this.getDenominator() * other.getNumerator() == 0;
    }
}
