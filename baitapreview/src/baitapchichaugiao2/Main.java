package baitapchichaugiao2;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        FileStudentManager fileStudentManager = new FileStudentManager();
        CheckValidate validate = new CheckValidate();
        manager.addStudent(new Student("C0321K1","Chương","18/05/1990","nam","chuong.tromcho@gmail.com","Quất Lâm",9.0));
        manager.addStudent(new Student("C0321K2","Chương","18/05/1990","nam","chuong.exciter@gmail.com","Thịnh Long",8.0));
        manager.addStudent(new Student("C0321K3","tuyền","18/05/1990","nam","tuyen.tuat@gmail.com","Quảng Ninh",8.0));
        manager.addStudent(new Student("C0321K5","Tú","18/05/1990","nam","tu.ngu@gmail.com","Trần Duy Hưng",8.0));
        while (true) {
            System.out.println("-----MeNu-----");
            System.out.println("1. Thêm Một Học Sinh Mới");
            System.out.println("2. Hiển Thị Danh Sách Học Sinh");
            System.out.println("3. Chỉnh Sửa  học sinh");
            System.out.println("4. Tìm Kiếm Học Sinh");
            System.out.println("5. Xóa  Học Sinh");
            System.out.println("6. Sắp xếp danh sách");
            System.out.println("7. Ghi tất cả vào file");
            System.out.println("8. Hiển Thị dữ liệu trong file");
            System.out.println("9. Kết thúc chương trình");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String addid;
                    System.out.println("Nhập id (CGXXX) ");
                    do {
                        sc.nextLine();
                        addid = sc.nextLine();
                        if (!validate.validateID(addid)) {
                            System.out.println("nhập lại id theo mẫu");
                        }
                    } while (!validate.validateID(addid));

                    String name;
                    System.out.println("Nhập tên [A-Z] ");
                    do {
                        name = sc.nextLine();
                        if (!validate.validateName(name)) {
                            System.out.println("nhập lại tên theo mẫu");
                        }
                    }
                    while (!validate.validateName(name));
                    String year;
                    System.out.println("Nhập ngày sinh DD/MM/YY ");
                    do {
                        year = sc.nextLine();
                        if (!validate.validateDate(year)) {
                            System.out.println("Nhập lại ngày sinh theo mẫu");
                        }
                    }
                    while (!validate.validateDate(year));


                    System.out.println("Nhập giới tính  ");
                    String gender = sc.nextLine();
                    System.out.println("Nhập địa chỉ");
                    String address = sc.nextLine();


                    String email;
                    System.out.println("Nhập email ");
                    do {
                        email = sc.nextLine();
                        if (!validate.validateEmail(email)) {
                            System.out.println("nhập email đúng form abc@mail.com");
                        }
                    } while (!validate.validateEmail(email));

            System.out.println("Nhập Điểm trung bình ");
            Double avg = Double.parseDouble(sc.nextLine());
            manager.addStudent(new Student(addid, name, year, gender, email, address, avg));
            break;
            case 2:
                manager.display();
                break;
            case 3:
                System.out.println("Nhập id bạn cần chỉnh sửa");
                String editid;
                System.out.println("Nhập id (CGXXX) ");
                do {
                    sc.nextLine();
                    editid = sc.nextLine();
                    if (!validate.validateID(editid)) {
                        System.out.println("nhập lại id theo mẫu");
                    }
                } while (!validate.validateID(editid));

                String editname;
                System.out.println("Nhập tên [A-Z] ");
                do {
                    editname = sc.nextLine();
                    if (!validate.validateName(editname)) {
                        System.out.println("nhập lại tên theo mẫu");
                    }
                }
                while (!validate.validateName(editname));
                String edityear;
                System.out.println("Nhập ngày sinh DD/MM/YY ");
                do {
                    edityear = sc.nextLine();
                    if (!validate.validateDate(edityear)) {
                        System.out.println("Nhập lại ngày sinh theo mẫu");
                    }
                }
                while (!validate.validateDate(edityear));


                System.out.println("Nhập giới tính  ");
                String editgender = sc.nextLine();
                System.out.println("Nhập địa chỉ");
                String editaddress = sc.nextLine();
                System.out.println("Nhập email ");
                String editemail;
                do {
                    editemail = sc.nextLine();
                    if (!validate.validateEmail(editemail)) {
                        System.out.println("nhập email đúng form abc@mail.com");
                    }
                } while (!validate.validateEmail(editemail));
                System.out.println("Nhập Điểm trung bình ");
                double editavg = sc.nextDouble();
                manager.editStudent(editid, new Student(editid, editname, edityear, editgender, editemail, editaddress, editavg));
                break;
            case 4:
                System.out.println("Bạn muốn tìm kiếm theo dạng nào");
                System.out.println("1.Tìm Theo id");
                System.out.println("2.Tìm Theo name");
                int choice2 = sc.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println("nhập id bạn muốn tìm kiếm ");
                        String idsearch = sc.next();
                        manager.searchforid(idsearch);
                        break;
                    case 2:
                        System.out.println("Nhập tên bạn muốn tìm kiếm");
                        String namesearch = sc.next();
                        manager.searchforName(namesearch);
                        break;
                }
                break;
            case 5:
                System.out.println("Bạn muốn xóa theo phương thức nào");
                System.out.println("1. Xóa theo id");
                System.out.println("2. Xóa theo tên");
                System.out.println("1. Xóa theo điểm trung bình");
                int sl = sc.nextInt();
                switch (sl){
                    case 1:
                        System.out.println("Nhập id bạn muốn xóa");
                        String iddelete = sc.next();
                        System.out.println("Bạn có chắc chắn muốn xóa không");
                        System.out.println("1.Có");
                        System.out.println("2.không");
                        int select =sc.nextInt();
                        if (select == 1) {
                            manager.deleteStudentbyId(iddelete);
                            System.out.println("Xóa thành công");
                        } else if (select == 2) {
                            System.out.println("bạn chưa xóa gì cả");

                        }
                        break;
                    case 2:
                        System.out.println("nhập tên bạn muốn xóa");
                        String deletename = sc.next();
                        System.out.println("Bạn có chắc chắn muốn xóa không");
                        System.out.println("1.Có");
                        System.out.println("2.không");
                        int select1 =sc.nextInt();
                        if (select1 == 1) {
                            manager.deleteStudentbyName(deletename);
                            System.out.println("Xóa thành công");
                        } else if (select1 == 2) {
                            System.out.println("bạn chưa xóa gì cả");
                        }
                        break;
                    case 3:
                        System.out.println("Nhập điểm số bạn muốn xóa");
                        double deletepoint = sc.nextDouble();
                        System.out.println("Bạn có chắc chắn muốn xóa không");
                        System.out.println("1.Có");
                        System.out.println("2.không");
                        int select2 =sc.nextInt();
                        if (select2 == 1) {
                            manager.deleteStudentbyAvg(deletepoint);
                            System.out.println("Xóa thành công");
                            manager.display();
                        } else if (select2 == 2) {
                            System.out.println("bạn chưa xóa gì cả");
                        }
                        break;
                }

                break;
            case 6:
                System.out.println("Bạn muốn sắp xếp theo cách nào");
                System.out.println("1. Sắp xếp theo tên");
                System.out.println("2. Sắp xếp theo điểm trung bình");
                int choice1 = sc.nextInt();
                if(choice1==1){
                    System.out.println("Danh Sách của bạn sau khi sắp xếp là  : ");
                    manager.sortforname();
                    manager.display();
                }else if(choice1==2){
                    System.out.println("Danh Sách của bạn sau khi sắp xếp là  : ");
                    manager.sortForAvg();
                    manager.display();
                }
                break;
            case 7:
                System.out.println("Đã Lưu tất cả dữ liệu vào file");
                    fileStudentManager.writetofile("baitapchichau.csv",Manager.studentList);
                break;
            case 8:
                System.out.println("Dữ liệu trong File là ");
                try {
                    List<Student> st=fileStudentManager.readFile("baitapchichau.csv");
                    for (Student student : st){
                        System.out.println(student.toStringCSV());
                    }

                } catch (Exception e) {
                    System.out.println("File bị lỗi");
                }

                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("mặc định hiển thị danh sách");
                manager.display();
                break;
        }
    }
}
}