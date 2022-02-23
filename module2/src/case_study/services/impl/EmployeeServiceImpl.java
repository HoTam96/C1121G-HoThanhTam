package case_study.services.impl;

import case_study.data.reader_file.ReaderFile;
import case_study.data.validate.TotalValidate;
import case_study.data.write_file.WriteFileCsv;
import case_study.services.EmployeeService;
import case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private static final String PATHFILE1 = "src/case_study/until/file_csv/employee/TrinhDo.csv";
    private static final String PATHFILE2 = "src/case_study/until/file_csv/employee/ViTri.csv";
    private static final String PATHFILE3 = "src/case_study/until/file_csv/employee/employee.csv";


    @Override
    public void addNew() {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào họ và tên");
        String name;
        while (true){
             name = sc.nextLine();
            name=name.trim();
            if (!name.equals("")){
                break;
            }else {
                System.out.println("bạn chưa hập tên");
            }
        }
        System.out.println("nhập vào ngày sinh");
        String  birthDay = TotalValidate.regexString(sc.nextLine(),TotalValidate.REGEX_DAY,"bạn đã nhaapkj sai định dạng");


        System.out.println("nhập vào giới tính");
        String male = sc.nextLine();
        System.out.println("nhập vào CMND");
        String cMND = sc.nextLine();
        System.out.println("nhập vào số điện thoai");
        double sDT = Double.parseDouble(TotalValidate.regexString(sc.nextLine(),TotalValidate.REGEX_so_Dien_Thoai,"bạn nhập sai định dạng"));
        System.out.println("nhập vào email");
        String email = TotalValidate.regexString(sc.nextLine(),TotalValidate.REGEX_EMAIL,"nhập sai định dạng bạ");

        System.out.println("nhập vào mã số nhân viên");
        String codeEmployee = sc.nextLine();

        System.out.println("nhập vào lương ");

        double luong = Double.parseDouble(TotalValidate.regexString(sc.nextLine(),TotalValidate.REGEX_TIEN,"nhập sai định dạng"));
        System.out.println("1.trung cấp\n" +
                "2. cao đăng\n" +
                "3. đại học\n" +
                "4. sau đại học");
        int trinhDo;
        while (true){
        try {
            System.out.println("lựa chọn trình độ");
             trinhDo = Integer.parseInt(sc.nextLine());
            break;
        }catch (NumberFormatException e){
            System.out.println("nhập sai định dạng");
        }
        }

        System.out.println("chọn vị trí");
        System.out.println("1. lễ tân\n" +
                "2. phục vụ\n" +
                "3. chuyên viên\n" +
                "4. giám sát\n" +
                "5. quản lí\n" +
                "6. giám đốc");
        int viTri;
        while (true) {
            try {
                viTri = Integer.parseInt(sc.nextLine());
                break;
            } catch(NumberFormatException e ){
                    System.out.println("sai định dạng");
                }
            }

        List<String>listTrinhDo= ReaderFile.readerTrinhDo(PATHFILE1);
        List<String>listViTri= ReaderFile.readerViTri(PATHFILE2);


        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        Employee employee = new Employee(name, birthDay, male, cMND, sDT, email, codeEmployee, listTrinhDo.get(trinhDo - 1), listViTri.get(viTri - 1), luong);
        employeeArrayList.add(employee);
        WriteFileCsv.writeEmployee(employeeArrayList,PATHFILE3,true);

    }

    @Override
    public void displayList() {
//        đọc file lấy dữ liệu ra.
        List<Employee>employeeList=ReaderFile.readerEmployee(PATHFILE3);

        for (Employee element : employeeList){
            System.out.println(element);
        }
    }

    @Override
    public void Edit(String name) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        List<String>listTrinhDo= ReaderFile.readerTrinhDo(PATHFILE1);
        List<String>listViTri= ReaderFile.readerViTri(PATHFILE2);
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
                            String name1 = TotalValidate.regexString(sc.nextLine(),TotalValidate.REGEX_SERVICE_NAME,"bạn đã nhập sai định dạng");
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
                            double sDT = Double.parseDouble(TotalValidate.regexString(sc.nextLine(),TotalValidate.REGEX_so_Dien_Thoai,"nhập sai định dạng"));
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
                            System.out.println("1.trung cấp\n" +
                                    "2. cao đăng\n" +
                                    "3. đại học\n" +
                                    "4. sau đại học");
                            int trinhDo ;
                            while (true){
                                try {
                                    System.out.println("lựa chọn trình độ");
                                    trinhDo = Integer.parseInt(sc.nextLine());
                                    break;
                                }catch (NumberFormatException e){
                                    System.out.println("nhập sai định dạng");
                                }
                            }
                            element.setTrinhDo(listTrinhDo.get(trinhDo - 1));
                            break;
                        case 10:

                            System.out.println("1. lễ tân\n" +
                                    "2. phục vụ\n" +
                                    "3. chuyên viên\n" +
                                    "4. giám sát\n" +
                                    "5. quản lí\n" +
                                    "6. giám đốc");
                            int viTri;
                            while (true) {
                                try {
                                    System.out.println("chọn vị trí");
                                    viTri = Integer.parseInt(sc.nextLine());
                                    break;
                                } catch(NumberFormatException e ){
                                    System.out.println("sai định dạng");
                                }
                            }

                            element.setViTri(listViTri.get(viTri - 1));
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
