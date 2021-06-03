package baitapchichaugiao2;

import java.util.*;

public class Manager {
    private List<Student> personList;
    public static List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student){
        studentList.add(student);
    }
    public void display(){
        for(int i =0;i<studentList.size();i++){
            System.out.println(studentList.get(i) + "\t");
        }
    }

    public void deleteStudentbyId(String id){// xóa theo id
     for(int i=0;i<studentList.size();i++){
         if(id.equals(studentList.get(i).getId())){
             studentList.remove(i);
             break;
         }
         else {
             System.out.println("không có id này");
         }
     }
    }
    public void deleteStudentbyName(String name){// xóa theo tên
        for(int i =0;i<studentList.size();i++){
            if(name.equals(studentList.get(i).getName())){
                studentList.remove(i);
                break;
            }
            else {
                System.out.println("không có tên này");
            }
        }
    }
    public void deleteStudentbyAvg(double avg){ // xóa theo điểm
        for(int i =0;i<studentList.size();i++){
            if(avg==studentList.get(i).getAveragePoint()){
                studentList.remove(i);
                break;
            }else {
                System.out.println("không có số điểm này");
            }
        }
    }
    public Student editStudent(String id, Student student ){ // sửa thông tin theo tên
        for (int i = 0; i < studentList.size(); i++) {
            if (id.equals(studentList.get(i).getId())) {
                return studentList.set(i,student);
            }
    }   return new Student();


    }
    public void searchforid(String id) { // tìm kiếm theo id
        for (Student student : studentList) {
            if (id.equals(student.getId())) {
                System.out.println(student.toString());
                break;
            }
            System.out.println("không có id này");
        }

    }
    public void searchforName(String name){ // tìm kiếm theo tên
        for(int i =0;i<studentList.size();i++){
            if(name.equals(studentList.get(i).getName())){
                System.out.println(studentList.get(i).toString());
                break;
            }
            System.out.println("không có tên này");
        }

    }
    public void sortforname(){ // sắp xếp theo tên
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               int result = o1.getName().compareTo(o2.getName());
               if(result==0){
                   return (int) (o1.getAveragePoint()-o2.getAveragePoint());
               }
               return result;
            }
        });
    }
    public  void sortForAvg(){ // sắp xếp theo điểm
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = (int) (o1.getAveragePoint() - o2.getAveragePoint());
                if(result==0){
                    return (int) (o1.getName().compareTo(o2.getName()));
                }
                return 0;
            }
        });
    }


}
