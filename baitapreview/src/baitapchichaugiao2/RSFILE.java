package baitapchichaugiao2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class RSFILE {
    public static void writeToFile(String path) throws Exception{
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("id,name,age,gender,email,address,AveragePoint");
        bufferedWriter.close();
        fileWriter.close();
    }
    public static void readfromFile(String path) throws Exception{
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String res;
        while ((res=bufferedReader.readLine())!=null){
            System.out.println(res);
        };
        bufferedReader.close();
        fileReader.close();
    }

}
