package case_study.models;

public abstract class Facility {
    private String serviceName;
    private float usableArea;
    private double rentalCost;
    private int maximumNumberPeople;
    private String rentType;
    private static int number=1;
    private int id ;
    private String serviceCode;

    public Facility(String serviceName, float usableArea, double rentalCost, int maximumNumberPeople,
                    String rentType, String serviceCode) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maximumNumberPeople = maximumNumberPeople;
        this.rentType = rentType;
        this.id = number++;
        this.serviceCode = serviceCode;
    }

    public Facility() {
        this.id = number++;
    }

    public Facility(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Facility.number = number;
    }

    public float getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(float usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaximumNumberPeople() {
        return maximumNumberPeople;
    }

    public void setMaximumNumberPeople(int maximumNumberPeople) {
        this.maximumNumberPeople = maximumNumberPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maximumNumberPeople=" + maximumNumberPeople +
                ", rentType=" + rentType +
                ", id=" + id +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }
}
