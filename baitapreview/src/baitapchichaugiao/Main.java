package baitapchichaugiao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {

            System.out.println("Nhập lựa chọn của bạn");
            System.out.println("1: Thêm Một Học Sinh Mới");
            System.out.println("2: Hiển Thị Danh Sách Học Sinh ");
            System.out.println("3: Xóa Một Học Sinh");
            System.out.println("4; Chỉnh Sửa Thông tin Học Sinh");
            System.out.println("5: Sắp Xếp Danh Sách");
            System.out.println("6: Tìm Kiếm Thông Tin Học Sinh");
            System.out.println("7: Thoát");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            Manager manager = new Manager();
            switch (choice) {
                case 1:
                    System.out.println("Nhập id");
                    int id = sc.nextInt();
                    System.out.println("Nhập Tên Học Sinh");
                    String name = sc.next();
                    System.out.println("Nhập Tuổi ");
                    int age = sc.nextInt();
                    System.out.println("Nhập giới tính");
                    String gender = sc.next();
                    System.out.println("Nhập Địa Chỉ");
                    String address = sc.next();
                    System.out.println("Nhập Level");
                    int level = sc.nextInt();
                    manager.addStudent(id, new Student(name, age, gender, address, level));
                    break;
                case 2:
                    manager.display();
                    break;
                case 3:
                    System.out.println("Nhập id bạn muốn xóa");
                    int idofdelete = sc.nextInt();
                    manager.deleteStudent(idofdelete);
                    break;
                case 4:
                    System.out.println("Nhập id bạn muốn chỉnh sửa");
                    int editid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập Tên Học Sinh");
                    String editname = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Nhập Tuổi ");
                    int editage = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập giới tính");
                    String editgender = sc.next();
                    sc.nextLine();
                    System.out.println("Nhập Địa Chỉ");
                    String editaddress = sc.next();
                    sc.nextLine();
                    System.out.println("Nhập Level");
                    int editlevel = sc.nextInt();
                    sc.nextLine();
                    manager.editforName(editid, new Student(editname, editage, editgender, editaddress, editlevel));
                    System.out.println("Danh sách của bạn sau khi sắp xếp là");
                    manager.display();
                    break;
                case 5:
                    manager.sortforName();
                    break;
                case 6:
                    System.out.println("1: Tìm Kiếm Theo id");
                    int selection = sc.nextInt();
                    System.out.println("2: Tìm Kiếm Theo Tên ");
                    System.out.println("3: Tìm Kiếm Theo Tuổi ");
                    System.out.println("4: Trở về ");
                    switch (selection) {
                        case 1:
                            System.out.println("Nhập id bạn muốn tìm kiếm ");
                            int searchId = sc.nextInt();
                            manager.searchforId(searchId);
                            break;
                        case 2:
                            System.out.println("Nhập Tên bạn muốn tìm kiếm ");
                            String searchName = sc.nextLine();
                            manager.searchforName(searchName);
                            break;
                        case 3:
                            System.out.println("Nhập số tuổi bạn muốn tìm kiếm");
                            int searchAge = sc.nextInt();
                            manager.searchforage(searchAge);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println(" Bạn không có lựa chọn nào");
                            break;
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Vui Lòng Nhập Lựa Chọn của bạn");
            }
        }
    }

}
