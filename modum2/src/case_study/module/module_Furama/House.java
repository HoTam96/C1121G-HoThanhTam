package case_study.module.module_Furama;

public class House extends ResortFurama{
    private String roomStandard;
    private int numberOfFloor;

    public House(String serviceName, float usableArea, double rentalCost, int maximumNumberPeople, RentType rentType, String roomStandard, int numberOfFloor) {
        super(serviceName, usableArea, rentalCost, maximumNumberPeople, rentType);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public House() {
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
}

