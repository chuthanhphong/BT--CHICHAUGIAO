package baitapchichaugiao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        FileStudentManager fileStudentManager = new FileStudentManager();
        validate validate = new validate();
        while (true){
            System.out.println("-----MeNu-----");
            System.out.println("1. Thêm Một Học Sinh Mới");
            System.out.println("2. Hiển Thị Danh Sách Học Sinh");
            System.out.println("3. Chỉnh Sửa  học sinh");
            System.out.println("4. Tìm Kiếm Học Sinh");
            System.out.println("5. Xóa  Học Sinh");
            System.out.println("6. Ghi tất cả vào file");
            System.out.println("7. Hiển Thị dữ liệu trong file");
            System.out.println("8. Kết thúc chương trình");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập id ");
                    System.out.println("Nhập id ");
                    System.out.println("Nhập id ");
                    System.out.println("Nhập id ");
                    System.out.println("Nhập id ");
                    System.out.println("Nhập id ");
                    System.out.println("Nhập id ");
            }
        }
    }



}
