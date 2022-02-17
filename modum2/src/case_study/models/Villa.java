package case_study.models;

public class Villa extends Facility {
    private String roomStandard;
    private float poolArea;
    private int numberFloors;
    private static int count=1;
    private int countVilla;


    public Villa(String serviceName, float usableArea, double rentalCost, int maximumNumberPeople,
                 String rentType, String serviceCode, String roomStandard, float poolArea, int numberFloors) {
        super(serviceName, usableArea, rentalCost, maximumNumberPeople, rentType, serviceCode);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
        this.countVilla=count++;
    }

    public Villa(String roomStandard, float poolArea, int numberFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public Villa() {
        this.countVilla=count++;
    }

    public Villa(String serviceName) {
        super(serviceName);
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Villa.count = count;
    }

    public int getCountVilla() {
        return countVilla;
    }

    public void setCountVilla(int countVilla) {
        this.countVilla = countVilla;
    }

    public String getInForVilla(){
        return (this.getServiceName()+","+this.getUsableArea()+","+this.getRentalCost()+","+
                this.getMaximumNumberPeople()+","+this.getRentType()+","+this.getServiceCode()+","+this.roomStandard+","+this.poolArea+","+this.numberFloors);
    }

    @Override
    public String toString() {
        return
                super.toString() +
                        "roomStandard='" + roomStandard + '\'' +
                        ", poolArea=" + poolArea +
                        ", numberFloors=" + numberFloors +
                        '}';
    }

}
