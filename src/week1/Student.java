package week1;

public class Student {
    private String name, id, group, email;

    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public Student(String name, String id, String email) {
        this(name, id, "INT22041", email);
    }

    public Student() {
        this("Student", "000", "INT22041", "uet@vnu.edu.vn");
    }

    public Student(Student student) {
        this(student.name, student.id, student.group, student.email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getInfo() {
        System.out.println(this.name + " " + this.id + " " + this.group + " " + this.email);
    }
}
