package case_study.module.module_Furama;

public class Room extends Facility {
    private String freeService;
    private static int count=1;
    private int countRoom;

    public Room(String serviceName, float usableArea, double rentalCost, int maximumNumberPeople,
                RentType rentType, FuramaServiceCode serviceCode, String freeService) {
        super(serviceName, usableArea, rentalCost, maximumNumberPeople, rentType, serviceCode);
        this.freeService = freeService;
        this.countRoom =count++;
    }

    public Room(String serviceName) {
        super(serviceName);
    }

    public Room() {
        this.countRoom =count++;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Room.count = count;
    }

    public int getCountRoom() {
        return countRoom;
    }

    public void setCountRoom(int countRoom) {
        this.countRoom = countRoom;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }
}
