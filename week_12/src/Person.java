public class Person implements Comparable<Person> {

    protected String name;
    protected int age;
    protected String address;

    /**
     * Constructor. 
     */
    public Person() {
    }

    /**
     * Constructor.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * getName.
     */
    public String getName() {
        return name;
    }

    /**
     * setName.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getAge.
     */
    public int getAge() {
        return age;
    }

    /**
     * setAge.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * getAddress.
     */
    public String getAddress() {
        return address;
    }

    /**
     * setAddress.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * compareTo.
     */
    public int compareTo(Person person) {
        if (this.name.compareTo(person.name) == 0) {
            return this.age - person.age;
        } else {
            return this.name.compareTo(person.name);
        }
    }
}
