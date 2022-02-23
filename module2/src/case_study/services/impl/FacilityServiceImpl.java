package case_study.services.impl;

import case_study.data.reader_file.ReaderFile;
import case_study.data.validate.TotalValidate;
import case_study.data.write_file.WriteFileCsv;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.FacilityService;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    public static LinkedHashMap<Facility, Integer> facilityLinkedMap = new LinkedHashMap<>();

    private static ArrayList<String> typeRent = new ArrayList<>();
    public static List<Facility> facilityArrayList = new ArrayList<>();
    public static String PATHFILESERVICECODE = "src/case_study/until/file_csv/Facility/ServiceCode.csv";
    public static String PATHFILETYPERENT = "src/case_study/until/file_csv/Facility/TypeRent.csv";
    public static String PATHFACILITYMAP ="src/case_study/until/file_csv/Facility/FacilityMap.csv";
    public static String PATHFACILITYLIST = "src/case_study/until/file_csv/Facility/FacilityArrayList.csv";



    @Override
    public void addVilla() {
        List<String> typeRent = ReaderFile.readerServiceCode(PATHFILETYPERENT);

        Scanner sc = new Scanner(System.in);

        System.out.println("nhập tên VILLA");
        String serviceName = TotalValidate.regexString(sc.nextLine(),TotalValidate.REGEX_SERVICE_NAME,"nhập sai định dạng");

        System.out.println("diện tích sử dụng");
        float useBleArea = Float.parseFloat(TotalValidate.regexString(sc.nextLine(),TotalValidate.REGEX_AREA_POOL,"nhập sai định dạng"));

        System.out.println("chi phí thuê");
        double rentalCost = Double.parseDouble(TotalValidate.regexString(sc.nextLine(),TotalValidate.REGEX_TIEN,"nhập sai định dạng"));

        System.out.println("số người tối đa");
        int maximumPeople = Integer.parseInt(TotalValidate.regexString(sc.nextLine(),TotalValidate.REGEX_so_luong,"số người tối đa lớn hơn 3 và nhỏ hơn 2o"));

//        -----------cần validate-------------
        System.out.println("nhập mã dịch vụ");
        String serviceCode = sc.nextLine();

        System.out.println("tiêu chuẩn phòng");
        String roomStandard = sc.nextLine();

        System.out.println("diện tích hồ bơi");
        float poolArea = Float.parseFloat(TotalValidate.regexString(sc.nextLine(),TotalValidate.REGEX_AREA_POOL,"nhập sai định dạng"));
        System.out.println("số tầng");
        int numberFloors = Integer.parseInt(sc.nextLine());
        System.out.println("chọn kiểu thuê theo thứ tư ");
        for (String e:typeRent) {
            System.out.println(e);
        }
        int choice = Integer.parseInt(sc.nextLine());
        System.out.println("số lần sử dụng");
        int useNumber=Integer.parseInt(sc.nextLine());

        Villa villa = new Villa(serviceName, useBleArea, rentalCost, maximumPeople, typeRent.get(choice-1)
                , serviceCode, roomStandard, poolArea, numberFloors);
        facilityArrayList.add(villa);
        facilityLinkedMap.put(villa, useNumber);
        WriteFileCsv.writeFacilityList(facilityArrayList, PATHFACILITYLIST, true);
        WriteFileCsv.writeFacilityMap(facilityLinkedMap, PATHFACILITYMAP, true);

    }

    @Override
    public void addHouse() {
        List<String> typeRent = ReaderFile.readerServiceCode(PATHFILETYPERENT);
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên HOUSE");
        String serviceName= sc.nextLine();

        System.out.println("diện tích sử dụng");
        float useBleArea = Float.parseFloat(sc.nextLine());

        System.out.println("chi phí thuê");
        double rentalCost = Double.parseDouble(sc.nextLine());

        System.out.println("số người tối đa");
        int maximumPeople = Integer.parseInt(sc.nextLine());

        System.out.println("chọn kiểu thuê theo thứ tư ");
        for (String e:typeRent) {
            System.out.println(e);
        }
        int choice = Integer.parseInt(sc.nextLine());

//        cần validate
        System.out.println("nhập mã dịch vụ");
        String serviceCode = sc.nextLine();

        System.out.println("tiêu chuẩn phòng");
        String roomStandard = sc.nextLine();

        System.out.println("số tầng");
        int numberFloors = Integer.parseInt(sc.nextLine());

        System.out.println("số lần sử dụng");
        int useNumber=Integer.parseInt(sc.nextLine());
        House house = new House(serviceName , useBleArea, rentalCost, maximumPeople, typeRent.get(choice-1), serviceCode, roomStandard, numberFloors);
        facilityLinkedMap.put(house, useNumber);
        facilityArrayList.add(house);
        WriteFileCsv.writeFacilityList(facilityArrayList, PATHFACILITYLIST, true);
        WriteFileCsv.writeFacilityMap(facilityLinkedMap, PATHFACILITYMAP, true);
    }


    @Override
    public void addRoom() {
        List<String> typeRent = ReaderFile.readerServiceCode(PATHFILETYPERENT);

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên Room");
        String serviceName= sc.nextLine();

        System.out.println("diện tích sử dụng");
        float useBleArea = Float.parseFloat(sc.nextLine());

        System.out.println("chi phí thuê");
        double rentalCost = Double.parseDouble(sc.nextLine());

        System.out.println("số người tối đa");
        int maximumPeople = Integer.parseInt(sc.nextLine());

        System.out.println("chọn kiểu thuê theo thứ tư ");
        for (String e:typeRent) {
            System.out.println(e);
        }
        int choice = Integer.parseInt(sc.nextLine());

        System.out.println("nhập mã dịch vụ");
        String serviceCode = sc.nextLine();

        System.out.println("dịch vụ miễn đi kèm");
        String free = sc.nextLine();

        System.out.println("số lần sử dụng");
        int useNumber=Integer.parseInt(sc.nextLine());

        Room room = new Room(serviceName , useBleArea, rentalCost, maximumPeople, typeRent.get(choice-1),serviceCode, free);
        facilityLinkedMap.put(room, useNumber);
        facilityArrayList.add(room);
        WriteFileCsv.writeFacilityList(facilityArrayList, PATHFACILITYLIST, true);
        WriteFileCsv.writeFacilityMap(facilityLinkedMap, PATHFACILITYMAP, true);

    }

    @Override
    public void DisplayListFacility() {
        Map<Facility, Integer> facilityLinkedMap = ReaderFile.readerFileFacilityMap(PATHFACILITYMAP);

        Set<Facility> facilitySet = facilityLinkedMap.keySet();
        for (Facility element : facilitySet) {
            System.out.println(element + " số lần sử dụng là: " + facilityLinkedMap.get(element));

        }
    }

    @Override
    public void maintenance(int numberService) {
        Map<Facility, Integer> facilityLinkedMap = ReaderFile.readerFileFacilityMap(PATHFACILITYMAP);
        Set<Facility> list = facilityLinkedMap.keySet();
        for (Facility element : list) {
            if (facilityLinkedMap.get(element) == numberService) {
                System.out.println("dịch vụ " + element + " với số lần sử dụng " + numberService + " cần bảo trì");
            }

        }
        System.out.println("bạn có muốn bảo trì dịch vụ khồng");
        System.out.println("1.\t yes\n" +
                "2.\tphím bất kì để No");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        do {
            if (choice == 1) {
                System.out.println("bảo trì thành công");
            }

        } while (choice != 1);
    }

    public void delete(int id) {
        Map<Facility, Integer> facilityLinkedMap = ReaderFile.readerFileFacilityMap(PATHFACILITYMAP);
        Set<Facility> list = facilityLinkedMap.keySet();
        for (Facility element : list) {
            if (element.getId() == id) {
                facilityLinkedMap.remove(element);
            }
        }
        WriteFileCsv.writeFacilityMap(facilityLinkedMap, PATHFACILITYMAP, true);

    }

//    public void edit(int id) {
//        Map<Facility, Integer> facilityLinkedMap = ReaderFile.readerFileFacilityMap(PATHFACILITYMAP);
//        Scanner sc = new Scanner(System.in);
//        Set<Facility> list = facilityLinkedMap.keySet();
//        for (Facility element : list) {
//            if (element.getId() == id) {
//                System.out.println(element + "số lần dử dụng " + facilityLinkedMap.get(element));
//                System.out.println("chọn thông tin cần edit");
//
//            }
//        }
//        WriteFileCsv.writeFacilityMap(facilityLinkedMap, PATHFACILITYMAP, false);
//
//    }



}
