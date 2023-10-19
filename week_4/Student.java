public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * phuong thuc khoi tao.
     * 
     * @param name    ten
     * @param address dia chi
     * @param program program
     * @param year    nam
     * @param fee     fee
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * tra ve program.
     * 
     * @return program
     */
    public String getProgram() {
        return this.program;
    }

    /**
     * dat lai program.
     * 
     * @param program program
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * tra ve nam.
     * 
     * @return nam
     */
    public int getYear() {
        return this.year;
    }

    /**
     * dat lai nam.
     * 
     * @param year nam
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * tra ve fee.
     * 
     * @return fee
     */
    public double getFee() {
        return this.fee;
    }

    /**
     * dat lai fee.
     * 
     * @param fee fee
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + this.program + ",year="
                + this.year + ",fee=" + this.fee + "]";
    }

}
