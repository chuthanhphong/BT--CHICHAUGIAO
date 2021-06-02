package baitapchichaugiao2;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Manager manager = new Manager();
        manager.addStudent(new Student("1","Chương","18/05/1990","nam","abc","bcd",9.0));
        manager.addStudent(new Student("2","Chương","18/05/1990","nam","abc","bcd",8.0));
        manager.addStudent(new Student("3","tuyền","18/05/1990","nam","abc","bcd",8.0));
        manager.display();
//        System.out.println("-------------------------");
//        manager.sortforname();
//        manager.display();
       manager.editStudent("1",new Student("2","Chiến","18/05/1990","nam","abc","bcd",8.0));
       manager.display();



    }
}
