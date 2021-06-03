package baitapchichaugiao2;

import java.time.Year;
import java.util.Comparator;

public class Student implements Comparator {
    private String id;// mã sinh viên
    private String name; // họ và tên
    private String datOfBirth;// ngày sinh;
    private String gender ;// giới tính
    private String email; // email
    private String address; // địa chỉ
    private double AveragePoint; // điểm trung bình
    private int age;


    public Student() {
    }

    public Student(String id, String name, String datOfBirth, String gender, String email, String address, double averagePoint) {
        this.id = id;
        this.name = name;
        this.datOfBirth = datOfBirth;
        this.gender = gender;
        this.email = email;
        this.address = address;
        AveragePoint = averagePoint;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatOfBirth() {
        return datOfBirth;
    }

    public void setDatOfBirth(String datOfBirth) {
        this.datOfBirth = datOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAveragePoint() {
        return AveragePoint;
    }

    public void setAveragePoint(double averagePoint) {
        AveragePoint = averagePoint;
    }
    public void getage(){
    }

    @Override
    public String toString() {
        return "Student : |" +
                "id=" + id +
                ", name=" + name + '\'' +
                ", datOfBirth=" + datOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", AveragePoint=" + AveragePoint
                ;
    }
    public String toStringCSV(){
        return "Student " +"," +name+","+datOfBirth+","+gender+","+email+","+address+","+AveragePoint;
    }


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
