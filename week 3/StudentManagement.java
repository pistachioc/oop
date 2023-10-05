import java.util.ArrayList;

public class StudentManagement_week4 {

    Student_week4[] students = new Student_week4[100];

    /**
     * xem 2 hoc sinh co cung nhom khong.
     */
    public static boolean sameGroup(Student_week4 s1, Student_week4 s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * them hoc sinh vao danh sach.
     */
    public void addStudent(Student_week4 newStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
    }

    /**
     * hco sinh theo nhom.
     */
    public String studentsByGroup() {
        String result = "";
        ArrayList<String> groupList = new ArrayList<String>();
        for (Student_week4 s : students) {
            if (s == null) {
                break;
            }
            if (!groupList.contains(s.getGroup())) {
                groupList.add(s.getGroup());
            }
        }
        for (String group : groupList) {
            result += group + "\n";
            for (Student_week4 s : students) {
                if (s == null) {
                    break;
                }
                if (s.getGroup().equals(group)) {
                    result += s.getInfo() + "\n";
                }
            }
        }
        return result;
    }

    /**
     * xoa hoc sinh theo ID.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
            if (students[i].getId().equals(id)) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
                break;
            }
        }
    }
}
