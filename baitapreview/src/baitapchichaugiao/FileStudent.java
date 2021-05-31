package baitapchichaugiao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileStudent {

    void writerFile(String path, Map<Integer, Student> students) throws IOException {
        FileWriter fr = new FileWriter(path);
        BufferedWriter bf = new BufferedWriter(fr);
        bf.write("Id" + " ," + " Tên" + " ," + " Tuổi" + " ," + "Giới tính" + " ," + " Địa chỉ" + " ," + " level");
        bf.write("\n");
        for(Integer key : students.keySet()){
            bf.write(key+ ":" +students.get(key).toString() + "\n");
        }
        bf.close();
        fr.close();
    }
    static List<String> parseCsvLine(String csvLine)  {
                List<String> list = new ArrayList<>();
                if(csvLine!=null){
                    String [] strings = csvLine.split(",");
                    for(int i=0;i<strings.length;i++){
                        list.add(strings[i]);
                    }

                }
                return list;
    }
    public void readfile(String path){
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("danhsach.csv"));
            while ((line=br.readLine())!=null){
                System.out.println(parseCsvLine(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(br!=null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
