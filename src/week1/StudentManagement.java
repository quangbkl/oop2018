package week1;

public class StudentManagement {
    private Student[] students = new Student[100];
    private int index = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student student) {
        students[index++] = student;
    }

    public void printStudent() {
        for (int i = 0; i < index; i++) {
            students[i].getInfo();
        }
    }

    public void studentsByGroup() {
        // TODO:
    }

    public void removeStudent(String id) {
        for (int i = 0; i < index; i++) {
            if (students[i].getId().equals(id)) {
                if (i == index - 1) students[i] = null;
                while (i < index - 1) {
                    students[i] = students[i + 1];
                    i++;
                }
                students[i + 1] = null;
                index--;
                break;
            }
        }
    }

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Student s = new Student("name", "id", "group", "email");
        sm.addStudent(s);
        s = new Student(s);
        s.setId("ksdhfkjs");
        sm.addStudent(s);
        s = new Student(s);
        s.setId("HHH");
        sm.addStudent(s);
        sm.removeStudent("HHH");
        sm.printStudent();
    }
}
