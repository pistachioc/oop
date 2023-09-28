public class Student {
    private String name;

    private String id;

    private String group;

    private String email;

    /**
     * lay ten.
     */
    public String getName() {
        return name;
    }

    /**
     * dat ten.
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * lay ID.
     */
    public String getId() {
        return id;
    }

    /**
     * dat ID.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * lay nhom.
     */
    public String getGroup() {
        return group;
    }

    /**
     * dat nhom.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * lay email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * dat email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * lay thong tin.
     */
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    /**
     * ban mau Student.
     */
    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * ban mau Student 2.
     */
    public Student(String n, String sid, String em) {
        name = n;
        id = sid;
        group = "K62CB";
        email = em;
    }

    /**
     * Student3.
     */
    public Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

}
