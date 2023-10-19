public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * phuon thuc khoi tao.
     * 
     * @param name    ten
     * @param address dia chi
     * @param school  truong hoc
     * @param pay     pay
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * tra ve truong.
     * 
     * @return truong
     */
    public String getSchool() {
        return this.school;
    }

    /**
     * dat lai truong hoc.
     * 
     * @param school truong
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * tra ve pay.
     * 
     * @return pay
     */
    public double getPay() {
        return this.pay;
    }

    /**
     * dat lai pay.
     * 
     * @param pay pay
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + this.school + ",pay=" + this.pay + "]";
    }
}
