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

    public void deleteStudentbyId(String id){
     for(int i=0;i<studentList.size();i++){
         if(id.equals(studentList.get(i).getId())){
             studentList.remove(i);
         }
         else {
             System.out.println("không có id này");
         }
     }
    }
    public Student editStudent(String id, Student student ){
        for (int i = 0; i < studentList.size(); i++) {
            if (id.equals(studentList.get(i).getId())) {
                return studentList.set(i,student);
            }
    }   return new Student();


    }
    public String searchforid(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (id.equals(studentList.get(i).getId())) {
                return studentList.get(i).toString();
            }
        }
        return "không có id này";
    }
    public String searchforName(String name){
        for(int i =0;i<studentList.size();i++){
            if(name.equals(studentList.get(i).getName())){
                return studentList.get(i).toString();
            }
        }
        return "không có tên này";
    }
    public void sortforname(){
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
}
