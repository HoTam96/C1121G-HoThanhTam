package case_study.module.module_Furama;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloor;
    private static int count=1;
    private int countHouse;


    public House(String serviceName, float usableArea, double rentalCost, int maximumNumberPeople, RentType rentType, FuramaServiceCode serviceCode, String roomStandard, int numberOfFloor) {
        super(serviceName, usableArea, rentalCost, maximumNumberPeople, rentType,serviceCode);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
        this.countHouse=count++;
    }

    public House(String roomStandard, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public House() {
        this.countHouse=count++;

    }

    public House(String serviceName) {
        super(serviceName);
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }


    @Override
    public String toString() {
        return super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}

