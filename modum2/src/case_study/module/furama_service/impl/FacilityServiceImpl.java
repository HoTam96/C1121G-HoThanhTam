package case_study.module.furama_service.impl;

import case_study.module.furama_service.FacilityService;
import case_study.module.module_Furama.*;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    public static LinkedHashMap<Facility, Integer> facilityLinkedMap = new LinkedHashMap<>();
    private static ArrayList<FuramaServiceCode> codeArrayList = new ArrayList<>();
    public static List<Facility> villaArrayList = new ArrayList<>();
    public static List<Facility> houseArrayList = new ArrayList<>();
    public static List<Facility> roomArrayList = new ArrayList<>();
    public static List<Facility> facilityArrayList = new ArrayList<>();

   public static Facility villa1;
   public static Facility villa2;
   public static Facility villa3;

   public static Facility house1;
   public static Facility house2;
   public static Facility house3;

   public static Facility room1;
   public static Facility room2;
   public static Facility room3;
   public static Facility room4;
   public static Facility room5;







    static {
        RentType rentType1 = new RentType("5 ngày");
        RentType rentType2 = new RentType("5 giờ");
        RentType rentType3 = new RentType(" 1 tháng");
        RentType rentType4 = new RentType(" 1 năm");

        FuramaServiceCode furamaServiceCode1 = new FuramaServiceCode("VILLA01234");
        FuramaServiceCode furamaServiceCode2 = new FuramaServiceCode("HOUSE01234");
        FuramaServiceCode furamaServiceCode3 = new FuramaServiceCode("ROOM01234");
        codeArrayList.add(furamaServiceCode1);
        codeArrayList.add(furamaServiceCode2);
        codeArrayList.add(furamaServiceCode3);





         villa1 = new Villa("VILLA ", 200.5f, 10000000d,
                5, rentType3, furamaServiceCode1, "5 sao", 20.4f, 2);

         villa2 = new Villa("VILLA PLUS ", 300f, 20000000d,
                7, rentType3, furamaServiceCode1, "5 sao", 30.4f, 2);

         villa3 = new Villa("VILLA ULTRA", 400f, 30000000d,

                10, rentType3, furamaServiceCode1, "5 sao", 40.4f, 2);


         house1 = new House("HOUSE", 80.2f, 5000000, 4, rentType1, furamaServiceCode2, "4 sao", 4);
         house2 = new House("HOUSE PLUS", 100.2f, 8000000, 5, rentType1, furamaServiceCode2, "4 sao", 3);
         house3 = new House("HOUSE ULTRA", 120.2f, 10000000, 6, rentType1, furamaServiceCode2, "4 sao", 4);

         room1 = new Room("ROOM", 40.5f, 1000000, 2, rentType2, furamaServiceCode3, "freeWater");
         room2 = new Room("ROOM PLUS", 50.5f, 2000000, 2, rentType1, furamaServiceCode3, "freeWater");
         room3 = new Room("ROOM ULTRA", 60.5f, 3000000, 2, rentType3, furamaServiceCode3, "freeWater");
         room4 = new Room("ROOM VIP", 70.5f, 3000000, 2, rentType2, furamaServiceCode3, "freeWater");
         room5 = new Room("ROOM VIP PRO", 80.5f, 4000000, 2, rentType2, furamaServiceCode3, "freeWater");

        facilityLinkedMap.put(villa1, 0);
        facilityLinkedMap.put(villa2, 0);
        facilityLinkedMap.put(villa3, 0);
        facilityLinkedMap.put(house1, 0);
        facilityLinkedMap.put(house2, 0);
        facilityLinkedMap.put(house3, 0);
        facilityLinkedMap.put(room1, 0);
        facilityLinkedMap.put(room2, 0);
        facilityLinkedMap.put(room3, 0);

        facilityArrayList.add(villa1);
        facilityArrayList.add(villa2);
        facilityArrayList.add(villa3);
        facilityArrayList.add(house1);
        facilityArrayList.add(house2);
        facilityArrayList.add(house3);
        facilityArrayList.add(room1);
        facilityArrayList.add(room2);
        facilityArrayList.add(room3);
        facilityArrayList.add(room4);
        facilityArrayList.add(room5);


        villaArrayList.add(villa1);
        villaArrayList.add(villa2);
        villaArrayList.add(villa3);

        houseArrayList.add(house1);
        houseArrayList.add(house2);
        houseArrayList.add(house3);


        roomArrayList.add(room1);
        roomArrayList.add(room2);
        roomArrayList.add(room3);
        roomArrayList.add(room4);
        roomArrayList.add(room5);


    }

    @Override
    public void addVilla() {

        Scanner sc = new Scanner(System.in);

        System.out.println("nhập tên VILLA");
        String serviceName= sc.nextLine();

        System.out.println("diện tích sử dụng");
        float useBleArea = Float.parseFloat(sc.nextLine());

        System.out.println("chi phí thuê");
        double rentalCost = Double.parseDouble(sc.nextLine());

        System.out.println("số người tối đa");
        int maximumPeople = Integer.parseInt(sc.nextLine());

        System.out.println("kiểu thuê");
        String rentType = sc.nextLine();
        RentType rentType1 = new RentType(rentType);

        System.out.println("-----mã dịch vụ-----\n" +
                "1. villa01\n" +
                "2. house02\n" +
                "3. room03");
        int viTri = Integer.parseInt(sc.nextLine());

        System.out.println("tiêu chuẩn phòng");
        String roomStandard = sc.nextLine();

        System.out.println("diện tích hồ bơi");
        float poolArea = Float.parseFloat(sc.nextLine());
        System.out.println("số tầng");
        int numberFloors = Integer.parseInt(sc.nextLine());

        int numberUse = 0;
        Villa villa = new Villa(serviceName , useBleArea, rentalCost, maximumPeople, rentType1, codeArrayList.get(viTri - 1), roomStandard, poolArea, numberFloors);
        villaArrayList.add(villa);
        facilityLinkedMap.put(villa,0);

    }

    @Override
    public void addHouse() {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên HOUSE");
        String serviceName= sc.nextLine();

        System.out.println("diện tích sử dụng");
        float useBleArea = Float.parseFloat(sc.nextLine());

        System.out.println("chi phí thuê");
        double rentalCost = Double.parseDouble(sc.nextLine());

        System.out.println("số người tối đa");
        int maximumPeople = Integer.parseInt(sc.nextLine());

        System.out.println("kiểu thuê");
        String rentType = sc.nextLine();
        RentType rentType1 = new RentType(rentType);
        System.out.println("-----mã dịch vụ-----\n" +
                "1. villa01\n" +
                "2. house02\n" +
                "3. room03");
        int viTri = Integer.parseInt(sc.nextLine());

        System.out.println("tiêu chuẩn phòng");
        String roomStandard = sc.nextLine();

        System.out.println("số tầng");
        int numberFloors = Integer.parseInt(sc.nextLine());

        int numberUse = 0;
        House house = new House(serviceName , useBleArea, rentalCost, maximumPeople, rentType1, codeArrayList.get(viTri - 1), roomStandard, numberFloors);
        facilityLinkedMap.put(house, numberUse);
        houseArrayList.add(house);
    }


    @Override
    public void addRoom() {


        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên Room");
        String serviceName= sc.nextLine();

        System.out.println("diện tích sử dụng");
        float useBleArea = Float.parseFloat(sc.nextLine());

        System.out.println("chi phí thuê");
        double rentalCost = Double.parseDouble(sc.nextLine());

        System.out.println("số người tối đa");
        int maximumPeople = Integer.parseInt(sc.nextLine());

        System.out.println("kiểu thuê");
        String rentType = sc.nextLine();
        RentType rentType1 = new RentType(rentType);

        System.out.println("-----mã dịch vụ-----\n" +
                "1. villa01\n" +
                "2. house02\n" +
                "3. room03");
        int viTri = Integer.parseInt(sc.nextLine());

        System.out.println("dịch vụ miễn đi kèm");
        String free = sc.nextLine();


        int numberUse = 0;

        Room room = new Room(serviceName , useBleArea, rentalCost, maximumPeople, rentType1, codeArrayList.get(viTri - 1), free);
        facilityLinkedMap.put(room, numberUse);
        roomArrayList.add(room);

    }

    @Override
    public void displayList() {
        Set<Facility> facilitySet = facilityLinkedMap.keySet();
        for (Facility element : facilitySet) {
            System.out.println(element + " số lần sử dụng là: " + facilityLinkedMap.get(element));

        }

    }

    @Override
    public void maintenance(int numberService) {
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
        Set<Facility> list = facilityLinkedMap.keySet();
        for (Facility element : list) {
            if (element.getId() == id) {
                facilityLinkedMap.remove(element);
            }
        }

    }

    public void edit(int id) {
        Scanner sc = new Scanner(System.in);
        Set<Facility> list = facilityLinkedMap.keySet();
        for (Facility element : list) {
            if (element.getId() == id) {
                System.out.println(element + "số lần dử dụng " + facilityLinkedMap.get(element));
                System.out.println("chọn thông tin cần edit");


            }
        }

    }


    @Override
    public void Edit(String name) {

    }

    @Override
    public void addNew() {
    }
}
