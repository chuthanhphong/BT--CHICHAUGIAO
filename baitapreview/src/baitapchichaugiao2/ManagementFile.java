package baitapchichaugiao2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManagementFile {
    public static String sourceFile = "baitapchichau.csv";
    public static void writeToFile(List<Student> studentList, String path) throws IOException {
        FileOutputStream writeData = new FileOutputStream(path);
        ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
        writeStream.writeObject(studentList);
        writeStream.flush();
        writeStream.close();}

    public static List<Student> readFromFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream readData = new FileInputStream(path);
        ObjectInputStream readStream = new ObjectInputStream(readData);
        List<Student> people2 = (ArrayList<Student>) readStream.readObject();
        readStream.close();
        return people2;
    }





}
