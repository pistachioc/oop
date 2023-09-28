public class Person {
    private String name;
    private String address;

    /**
     * phuong thuc khoi tao.
     * 
     * @param name    ten
     * @param address dia chi
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * tra ve ten.
     * 
     * @return ten
     */
    public String getName() {
        return this.name;
    }

    /**
     * dat lai ten.
     * 
     * @param name ten
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * tra ve dia chi.
     * 
     * @return dia chi
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * dat lai dia chi.
     * 
     * @param address dia chi
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "Person[name=" + this.name + ",address=" + this.address + "]";
    }
}
