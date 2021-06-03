package baitapchichaugiao2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileStudentManager {
        void writetofile(String path , List<Student> studentList) throws IOException {
                FileWriter fw = new FileWriter(path);
                BufferedWriter bw = new BufferedWriter(fw);
                String str = "id, name, DateofBirth, gender, email, address, AveragePoint \n ";
                for (Student student : studentList) {
                        str += (student.getId() + "," + student.getName() + "," +
                                student.getDatOfBirth() + ","+
                                student.getGender() + "," + student.getEmail() +
                                "," + student.getAddress() + "," + student.getAveragePoint()+ "\n");
                }
                bw.write(str);
                bw.close();
                fw.close();
        }
        List<Student> readFile(String path) throws IOException{
                List<Student> studentList = new ArrayList<>();
                FileReader fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr);
                String content = br.readLine();
                while ((content=br.readLine())!=null){
                        String [] value = content.split(",");
                        studentList.add(new Student(value[0],value[1],value[2],value[3],value[4],value[5],Double.parseDouble(value[6])));
                };
                return studentList;
        }
}
