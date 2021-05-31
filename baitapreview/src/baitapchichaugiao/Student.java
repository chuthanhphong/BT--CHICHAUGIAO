package baitapchichaugiao;

public class Student extends Person implements Comparable<Student> {
    private int level;

    public Student() {
    }

    public Student(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
     return super.toString()  + "," + level;
    }

    @Override
    public int compareTo(Student student) {
       return this.getName().compareTo(student.getName());
    }
}
