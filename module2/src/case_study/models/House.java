package case_study.models;

import case_study.models.Facility;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloor;
    private static int count=1;
    private int countHouse;


    public House(String serviceName, float usableArea, double rentalCost, int maximumNumberPeople, String rentType, String serviceCode, String roomStandard, int numberOfFloor) {
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
    public String getInForHouse(){
        return (this.getServiceName()+","+this.getUsableArea()+","+this.getRentalCost()+","+
                this.getMaximumNumberPeople()+","+this.getRentType()+","+this.getServiceCode()+","+this.roomStandard+","+this.numberOfFloor);
    }
}

