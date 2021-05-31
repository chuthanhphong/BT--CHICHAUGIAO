package baitapchichaugiao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        File file = new File("danhsach.csv");
//        try {
//            if(!file.exists()){
//                file.createNewFile();
//            }
//        }catch (Exception e){
//            System.out.println("file đã tồn tại");
//        }
//        System.out.println(file.getAbsolutePath());
//        try {
//            FileStudent fileStudent = new FileStudent();
//            fileStudent.readfile("danhsach.csv");
//            Manager manager = new Manager();
//            fileStudent.writer("danhsach.csv", (HashMap<Integer, Student>) manager.listStudent);
//        }catch (Exception e){
//            System.out.println("wrong");
//        }

        Manager manager = new Manager();
        FileStudent fileStudent = new FileStudent();


        while (true) {
            System.out.println("----------Menu-----------");
            System.out.println("Nhập lựa chọn của bạn");
            System.out.println("1: Thêm Một Học Sinh Mới");
            System.out.println("2: Hiển Thị Danh Sách Học Sinh ");
            System.out.println("3: Xóa Một Học Sinh");
            System.out.println("4; Chỉnh Sửa Thông tin Học Sinh");
            System.out.println("5: Sắp Xếp Danh Sách");
            System.out.println("6: Tìm Kiếm Thông Tin Học Sinh");
            System.out.println("7: Đọc File");
            System.out.println("8: Thoát");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Nhập id");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập Tên Học Sinh");
                    String name = sc.nextLine();
                    System.out.println("Nhập Tuổi ");
                    int age = sc.nextInt();
                    System.out.println("Nhập giới tính");
                    String gender = sc.next();
                    sc.nextLine();
                    System.out.println("Nhập Địa Chỉ");
                    String address = sc.nextLine();
                    System.out.println("Nhập Level");
                    int level = sc.nextInt();
                    manager.addStudent(id, new Student(name, age, gender, address, level));
                    try {
                        fileStudent.writerFile("danhsach.csv", Manager.listStudent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 2 -> manager.display();
                case 3 -> {
                    System.out.println("Nhập id bạn muốn xóa");
                    int idofdelete = sc.nextInt();
                    manager.deleteStudent(idofdelete);
                    try {
                        fileStudent.writerFile("danhsach.csv", Manager.listStudent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 4 -> {
                    System.out.println("Nhập id bạn muốn chỉnh sửa");
                    int editid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập Tên Học Sinh");
                    String editname = sc.nextLine();
                    System.out.println("Nhập Tuổi ");
                    int editage = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập giới tính");
                    String editgender = sc.next();
                    System.out.println("Nhập Địa Chỉ");
                    String editaddress = sc.next();
                    System.out.println("Nhập Level");
                    int editlevel = sc.nextInt();
                    sc.nextLine();
                    manager.editforName(editid, new Student(editname, editage, editgender, editaddress, editlevel));
                    System.out.println("Danh sách của bạn sau khi sắp xếp là");
                    manager.display();
                    try {
                        fileStudent.writerFile("danhsach.csv", Manager.listStudent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 5 -> {
                    manager.sortforName();
                    try {
                        fileStudent.writerFile("danhsach.csv", Manager.listStudent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }

                case 6 -> {
                    System.out.println("Nhập lựa chọn bạn muốn tìm kiếm");
                    System.out.println("1: Tìm Kiếm Theo id");
                    System.out.println("2: Tìm Kiếm Theo Tên ");
                    System.out.println("3: Tìm Kiếm Theo Tuổi ");
                    int selection = sc.nextInt();
                    switch (selection) {
                        case 1: {
                            System.out.println("Nhập id bạn muốn tìm kiếm ");
                            int searchId = sc.nextInt();
                            manager.searchforId(searchId);
                            break;
                        }
                        case 2: {
                            sc.nextLine();
                            System.out.println("Nhập Tên bạn muốn tìm kiếm ");
                            String searchName = sc.nextLine();
                            manager.searchforName(searchName);
                            break;
                        }
                        case 3: {
                            System.out.println("Nhập số tuổi bạn muốn tìm kiếm");
                            int searchAge = sc.nextInt();
                            manager.searchforage(searchAge);
                            break;
                        }
                        default:
                            System.out.println("không có lựa chọn của bạn");
                            break;
                    }
                }
                case 7 -> {
                    File file = new File("danhsach.csv");
                    try {
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                    } catch (Exception e) {
                        System.out.println("file đã tồn tại");
                    }
                    System.out.println(file.getAbsolutePath());
                    try {
                        FileStudent fileStudent1 = new FileStudent();
                        fileStudent1.readfile("danhsach.csv");
                    } catch (Exception e) {
                        System.out.println("wrong");
                    }
                    break;
                }

                case 8 -> System.exit(0);
                default -> System.out.println("Vui Lòng Nhập Lựa Chọn của bạn");
            }
        }
    }
}
