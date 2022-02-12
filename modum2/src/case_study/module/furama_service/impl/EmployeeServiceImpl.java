package case_study.module.furama_service.impl;

import case_study.module.data.write_file.WriteFileCsv;
import case_study.module.furama_service.EmployeeService;
import case_study.module.module_Furama.information.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static ArrayList<Employee> employeeArrayList = new ArrayList<>();
    private static ArrayList<String> arrayListTrinhDo = new ArrayList<>();
    private static ArrayList<String> arrayListViTri = new ArrayList<>();
    private static final String PATHFILE1 = "src/case_study/until/file_csv/employee/TrinhDo.csv";
    private static final String PATHFILE2 = "src/case_study/until/file_csv/employee/ViTri.csv";

    static {
        arrayListTrinhDo.add("trung cấp");
        arrayListTrinhDo.add("cao đẳng");
        arrayListTrinhDo.add("đại học");
        arrayListTrinhDo.add("sau đại học");

        arrayListViTri.add("lễ tân");
        arrayListViTri.add("phục vụ");
        arrayListViTri.add("chuyên viên");
        arrayListViTri.add("giám sát");
        arrayListViTri.add("quản lí");
        arrayListViTri.add("giám đốc");

        Employee employee1 = new Employee("Hồ Thanh Tâm", "04/08/1996", "nam", "205852669", 0788040896d, "hotam196@gmail.com", "ms01", arrayListTrinhDo.get(2), arrayListViTri.get(2), 25000000);
        Employee employee2 = new Employee("Lưu Bị", "02/08/996", "nam", "203582669", 07883687434d, "hotam196@gmail.com", "ms02", arrayListTrinhDo.get(3), arrayListViTri.get(3), 20000000);
        Employee employee3 = new Employee("Tào Tháo", "03/08/994", "nam", "205819069", 07880468954d, "hotam196@gmail.com", "ms03", arrayListTrinhDo.get(1), arrayListViTri.get(1), 18000000);
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);


        WriteFileCsv.writeViTri(arrayListViTri, PATHFILE2, true);
        WriteFileCsv.writeTrinhDo(arrayListTrinhDo, PATHFILE1, true);

    }

    @Override
    public void addNew() {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào họ và tên");
        String name = sc.nextLine();
        System.out.println("nhập vào ngày sinh");
        String birthDay = sc.nextLine();
        System.out.println("nhập vào giới tính");
        String male = sc.nextLine();
        System.out.println("nhập vào CMND");
        String cMND = sc.nextLine();
        System.out.println("nhập vào số điện thoai");
        double sDT = Double.parseDouble(sc.nextLine());
        System.out.println("nhập vào email");
        String email = sc.nextLine();
        System.out.println("nhập vào mã số nhân viên");
        String codeEmployee = sc.nextLine();
        System.out.println("nhập vào lương ");
        double luong = Double.parseDouble(sc.nextLine());
        System.out.println("lựa chọn trình độ");
        System.out.println("1.trung cấp\n" +
                "2. cao đăng\n" +
                "3. đại học\n" +
                "4. sau đại học");
        int trinhDo = Integer.parseInt(sc.nextLine());
        System.out.println("chọn vị trí");
        System.out.println("1. lễ tân\n" +
                "2. phục vụ\n" +
                "3. chuyên viên\n" +
                "4. giám sát\n" +
                "5. quản lí\n" +
                "6. giám đốc");

        int viTri = Integer.parseInt(sc.nextLine());
        Employee employee = new Employee(name, birthDay, male, cMND, sDT, email, codeEmployee, arrayListTrinhDo.get(trinhDo - 1), arrayListViTri.get(viTri - 1), luong);
        employeeArrayList.add(employee);

    }

    @Override
    public void displayList() {
        for (Employee element : employeeArrayList) {
            System.out.println(element);
        }
    }

    @Override
    public void Edit(String name) {
        boolean flag = true;
        for (Employee element : employeeArrayList) {
            if (element.getHoTen().contains(name)) {

                System.out.println("bạn có muốn sửa tên  này không " + element);
                flag = true;
                Scanner sc = new Scanner(System.in);
                System.out.println("nhập lại các thông tin cần edit");
                int choice;
                do {
                    System.out.println("1. tên nhân viên\n" +
                            "2. ngày sinh\n" +
                            "3. giới tính\n" +
                            "4. chứng minh nhân dân\n" +
                            "5. số điện thoai\n" +
                            "6. email\n" +
                            "7. mã số nhân viên\n" +
                            "8. lương\n" +
                            "9. trình độ\n" +
                            "10. vị trí\n " +
                            "0. thoát");

                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("nhập vào họ và tên");
                            String name1 = sc.nextLine();
                            element.setHoTen(name1);
                            break;
                        case 2:
                            System.out.println("nhập vào ngày sinh");
                            String birthDay = sc.nextLine();
                            element.setNgaySinh(birthDay);
                            break;
                        case 3:
                            System.out.println("nhập vào giới tính");
                            String male = sc.nextLine();
                            element.setGioiTinh(male);
                            break;
                        case 4:
                            System.out.println("nhập vào CMND");
                            String cMND = sc.nextLine();
                            element.setcMND(cMND);
                            break;
                        case 5:
                            System.out.println("nhập vào số điện thoai");
                            double sDT = Double.parseDouble(sc.nextLine());
                            element.setSoDienThoai(sDT);
                            break;
                        case 6:
                            System.out.println("nhập vào email");
                            String email = sc.nextLine();
                            element.setEmail(email);
                            break;
                        case 7:
                            System.out.println("nhập vào mã số nhân viên");
                            String codeEmployee = sc.nextLine();
                            element.setMaNhanVien(codeEmployee);
                            break;
                        case 8:
                            System.out.println("nhập vào lương ");
                            double luong = Double.parseDouble(sc.nextLine());
                            element.setLuong(luong);
                            break;
                        case 9:
                            System.out.println("lựa chọn trình độ");
                            System.out.println("1.trung cấp\n" +
                                    "2. cao đăng\n" +
                                    "3. đại học\n" +
                                    "4. sau đại học");
                            int trinhDo = Integer.parseInt(sc.nextLine());
                            element.setTrinhDo(arrayListTrinhDo.get(trinhDo - 1));
                            break;
                        case 10:
                            System.out.println("chọn vị trí");
                            System.out.println("1. lễ tân\n" +
                                    "2. phục vụ\n" +
                                    "3. chuyên viên\n" +
                                    "4. giám sát\n" +
                                    "5. quản lí\n" +
                                    "6. giám đốc");
                            int viTri = Integer.parseInt(sc.nextLine());
                            element.setViTri(arrayListViTri.get(viTri - 1));
                            break;
                        default:
                            if (choice != 0) {
                                System.err.println("mời nhập lại");
                            }

                    }

                } while (choice != 0);


            } else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("không tồn tại tên trong danh sách");
        }
    }
}
