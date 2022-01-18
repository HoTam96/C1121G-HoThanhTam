package case_study.module.module_Furama;

public class Villa extends ResortFurama {
    private String roomStandard;
    private float poolArea;
    private int numberFloors;

    public Villa(String serviceName, float usableArea, double rentalCost, int maximumNumberPeople, RentType rentType, String roomStandard, float poolArea, int numberFloors) {
        super(serviceName, usableArea, rentalCost, maximumNumberPeople, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String roomStandard, float poolArea, int numberFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public Villa() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
