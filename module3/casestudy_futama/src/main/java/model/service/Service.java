package model.service;

public class Service {
    private  Integer serviceId;
    private String serviceName;
    private int serviceArea;
    private double rentalCost;
    private  Integer peopleMax;
    private RentType renTypeId;
    private ServiceType serviceTypeId;
    private String standardRoom;
    private String descriptionOther;
    private double areaPool;
    private int numberFloor;

    public Service(Integer serviceId, String serviceName, int serviceArea, double rentalCost, Integer peopleMax, RentType renTypeId, ServiceType serviceTypeId, String standardRoom, String descriptionOther, double areaPool, int numberFloor) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.rentalCost = rentalCost;
        this.peopleMax = peopleMax;
        this.renTypeId = renTypeId;
        this.serviceTypeId = serviceTypeId;
        this.standardRoom = standardRoom;
        this.descriptionOther = descriptionOther;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public Service() {
    }

    public Service(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(int serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public Integer getPeopleMax() {
        return peopleMax;
    }

    public void setPeopleMax(Integer peopleMax) {
        this.peopleMax = peopleMax;
    }

    public RentType getRenTypeId() {
        return renTypeId;
    }

    public void setRenTypeId(RentType renTypeId) {
        this.renTypeId = renTypeId;
    }

    public ServiceType getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(ServiceType serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOther() {
        return descriptionOther;
    }

    public void setDescriptionOther(String descriptionOther) {
        this.descriptionOther = descriptionOther;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", serviceArea=" + serviceArea +
                ", rentalCost=" + rentalCost +
                ", peopleMax=" + peopleMax +
                ", renTypeId=" + renTypeId +
                ", serviceTypeId=" + serviceTypeId +
                ", standardRoom='" + standardRoom + '\'' +
                ", descriptionOther='" + descriptionOther + '\'' +
                ", areaPool=" + areaPool +
                ", numberFloor=" + numberFloor +
                '}';
    }


}
