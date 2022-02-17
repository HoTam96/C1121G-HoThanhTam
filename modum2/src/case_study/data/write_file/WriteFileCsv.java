package case_study.data.write_file;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;
import case_study.models.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteFileCsv {


    //    ghi file trinh do
    public static void writeTrinhDo(List<String> list, String pathFile, Boolean append) {
        writeFileString(list, pathFile, append);
    }

    public static void writeViTri(List<String> list, String pathFile, Boolean append) {
        writeFileString(list, pathFile, append);
    }

    public static void writeEmployee(List<Employee> employeeList, String pathFile, Boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Employee e : employeeList) {
            stringList.add(e.getInForEmployee());
        }
        writeFileString(stringList, pathFile, append);
    }

    public static void writeLoaiKhac(List<String> list, String pathFile, Boolean append) {
        writeFileString(list, pathFile, append);
    }

    //đọc ghi file customer
    public static void writeCustomer(List<Customer> customerList, String pathFile, Boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Customer e : customerList) {
            stringList.add(e.getInForCustomer());
        }
        writeFileString(stringList, pathFile, append);
    }

    //   ghi file mã dịch vụ
    public static void writeServiceCode(List<String> list, String pathFile, Boolean append) {
        writeFileString(list, pathFile, append);
    }

    //   ghi file type rent
    public static void writeTypeRent(List<String> list, String pathFile, Boolean append) {
        writeFileString(list, pathFile, append);
    }

    //   ghi file facility Map
    public static void writeFacilityMap(Map<Facility, Integer> map, String pathFile, Boolean append) {
        List<Facility> facilityList = new ArrayList<>(map.keySet());

        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.err.println("file không tồn tại");
            }
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Facility element : facilityList) {
                if (element.getServiceCode().contains("SVVL")) {
                    element = (Villa) element;
                    bufferedWriter.write(((Villa) element).getInForVilla() + "," + map.get(element));

                    bufferedWriter.newLine();
                } else if (element.getServiceCode().contains("SVHO")) {
                    element = (House) element;
                    bufferedWriter.write(((House) element).getInForHouse() + "," + map.get(element));
                    bufferedWriter.newLine();
                } else if (element.getServiceCode().contains("SVRO")) {
                    element = (Room) element;
                    bufferedWriter.write(((Room) element).getInForRoom() + "," + map.get(element));
                    bufferedWriter.newLine();

                }

            }
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //    ghi file FACILITY ARRAY LIST
    public static void writeFacilityList(List<Facility> list, String pathFile, Boolean append) {

        List<String> stringList = new ArrayList<>();
        for (Facility element : list) {
            if (element.getServiceCode().contains("SVVL")) {
                element = (Villa) element;
                stringList.add(((Villa) element).getInForVilla());
            } else if (element.getServiceCode().contains("SVHO")) {
                element = (House) element;
                stringList.add(((House) element).getInForHouse());
            } else if (element.getServiceCode().contains("SVRO")) {
                element = (Room) element;
                stringList.add(((Room) element).getInForRoom());
            }

        }

        writeFileString(stringList, pathFile, append);
    }




//    phần đọc ghi file booking

//    đọc ghi fie loại dịch vụ
public static void writeLoaiDichVu(List<String> list, String pathFile, Boolean append) {
    writeFileString(list, pathFile, append);
}
//đọc ghi file Booking
public static void writeBooking(Set<Booking> bookingSet, String pathFile, Boolean append) {
    List<String> stringList = new ArrayList<>();
    for (Booking e : bookingSet) {
        stringList.add(e.getInForBooking());
    }
    writeFileString(stringList, pathFile, append);
}
//ghi file hợp đồng
public static void writeContract(Queue<Contract> contractQueue, String pathFile, Boolean append) {
    List<String> stringList = new ArrayList<>();
    for (Contract e : contractQueue) {
        stringList.add(e.getInForContract());
    }
    writeFileString(stringList, pathFile, append);
}


    //    method tái sử dụng
    public static void writeFileString(List<String> stringList, String pathFile, Boolean append) {

        FileWriter fileWriter = null;
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println();
            }
            fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String element : stringList) {
                bufferedWriter.write(element);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
