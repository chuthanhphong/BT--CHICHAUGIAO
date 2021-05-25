package baitapchichaugiao;

public class test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addStudent(1,new Student("Chương",18,"Nam","Hà Nội",3));
        manager.addStudent(2,new Student("Chương",17,"Nam","Hà Nội",4));
        manager.addStudent(3,new Student("Tuyền",21,"Nam","Hà Nội",5));
        manager.display();

       ;




    }

}
