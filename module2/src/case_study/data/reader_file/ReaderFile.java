package case_study.data.reader_file;

import case_study.services.impl.BookingServiceImpl;
import case_study.services.impl.FacilityServiceImpl;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;
import case_study.models.Employee;

import java.io.*;
import java.util.*;

public class ReaderFile {

    public static List<String> readerTrinhDo(String pathFile) {
        List<String> stringList = new ArrayList<>();

        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;

    }


    // đọc fie vị trí
    public static List<String> readerViTri(String pathFile) {
        List<String> stringList = new ArrayList<>();

        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;

    }


    //    đọc file employee
    public static List<Employee> readerEmployee(String pathFile) {
        List<Employee> employeeList = new ArrayList<>();
        Employee.setNumberOfEmployee(1);
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arr;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Employee employee = new Employee(arr[0], arr[1], arr[2], arr[3], Double.parseDouble(arr[4]), arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9]));
                employeeList.add(employee);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;

    }

    //    đọc file loai khách hàng
    public static List<String> readerLoaiKhach(String pathFile) {
        List<String> stringList = new ArrayList<>();

        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;

    }

//    đọc file customer

    public static List<Customer> readerCustomer(String pathFile) {
        List<Customer> customerList = new ArrayList<>();
        Customer.setNumberOfCustomer(0);

        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arr;
            Booking booking = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                for (Booking element : BookingServiceImpl.bookingSet) {
                    if (element.getMaKhachHang().equals(arr[6])) {
                        booking = element;
                        Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], Double.parseDouble(arr[4]), arr[5], booking, arr[7], arr[8]);
                        customerList.add(customer);
                    }
                }

            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;

    }

    //    đọc file service Code
    public static List<String> readerServiceCode(String pathFile) {
        List<String> stringList = new ArrayList<>();

        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;

    }

    //đọc file kiểu thuê
    public static List<String> readerTypeRent(String pathFile) {
        List<String> stringList = new ArrayList<>();

        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;

    }

    //đọc file FACILITY MAP
    public static Map<Facility, Integer> readerFileFacilityMap(String pathFile) {
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        Facility.setNumber(1);
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arr;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                if (arr[5].contains("SVVL")) {
                    Villa villa = new Villa(arr[0], Float.parseFloat(arr[1]), Double.parseDouble(arr[2]),
                            Integer.parseInt(arr[3]), arr[4], arr[5], arr[6], Float.parseFloat(arr[7]),
                            Integer.parseInt(arr[8]));
                    facilityIntegerMap.put(villa, Integer.parseInt(arr[9]));
                }
                if (arr[5].contains("SVHO")) {
                    House house = new House(arr[0], Float.parseFloat(arr[1]), Double.parseDouble(arr[2]),
                            Integer.parseInt(arr[3]), arr[4], arr[5], arr[6], Integer.parseInt(arr[7]));
                    facilityIntegerMap.put(house, Integer.parseInt(arr[8]));
                }
                if (arr[5].contains("SVRO")) {
                    Room room = new Room(arr[0], Float.parseFloat(arr[1]), Double.parseDouble(arr[2]),
                            Integer.parseInt(arr[3]), arr[4], arr[5], arr[6]);
                    facilityIntegerMap.put(room, Integer.parseInt(arr[7]));
                }

            }

            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return facilityIntegerMap;
    }
//    đọc file facility Araylist

    public static List<Facility> readerFacilityArraylist(String pathFile) {
        List<Facility> facilityList = new ArrayList<>();
        Facility.setNumber(1);
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arr;
            Booking booking = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");

                if (arr[5].contains("SVVL")) {
                    Villa villa = new Villa(arr[0], Float.parseFloat(arr[1]), Double.parseDouble(arr[2]),
                            Integer.parseInt(arr[3]), arr[4], arr[5], arr[6],
                            Float.parseFloat(arr[7]), Integer.parseInt(arr[8]));
                    facilityList.add(villa);

                }
                if (arr[5].contains("SVHO")) {
                    House house = new House(arr[0], Float.parseFloat(arr[1]), Double.parseDouble(arr[2]),
                            Integer.parseInt(arr[3]), arr[4], arr[5], arr[6], Integer.parseInt(arr[7]));
                    facilityList.add(house);

                }
                if (arr[5].contains("SVRO")) {
                    Room room = new Room(arr[0], Float.parseFloat(arr[1]), Double.parseDouble(arr[2]),
                            Integer.parseInt(arr[3]), arr[4], arr[5], arr[6]);
                    facilityList.add(room);
                }
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilityList;

    }
//    đọc file booking

//    đọc file loại dịch vụ

    public static List<String> readerTypeService(String pathFile) {
        List<String> stringList = new ArrayList<>();

        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;

    }

    //  đọc file booking
    public static Set<Booking> readerBooking(String pathFile) {
        Set<Booking> bookingSet = new TreeSet<>();
        Booking.setNumber(1);
        List<Facility> facilityList = ReaderFile.readerFacilityArraylist(FacilityServiceImpl.PATHFACILITYLIST);
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arr;
            Booking booking = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                for (Facility element : facilityList) {
                    if (element.getServiceName().equals(arr[4])) {
                        Booking booking1 = new Booking(arr[0], arr[1], arr[2], arr[3], element, arr[5]);
                        bookingSet.add(booking1);
                    }
                }

            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingSet;

    }
//    đọc file contract

    public static Queue<Contract> readerContract(String pathFile) {
        Queue<Contract> contractQueue = new LinkedList<>();
        Contract.setNumberContract(1);
        Set<Booking> bookingSet = ReaderFile.readerBooking(BookingServiceImpl.PATHBOOKING1);
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arr;
            Booking booking = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                for (Booking element : bookingSet) {
                    if (element.getMaBooking().equals(arr[0])) {
                        Contract contract = new Contract(element,Double.parseDouble(arr[1]),Double.parseDouble(arr[2]),element);
                        contractQueue.offer(contract);
                    }
                }

            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contractQueue;

    }

}
