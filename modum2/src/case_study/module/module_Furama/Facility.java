package case_study.module.module_Furama;

public abstract class Facility {
    private String serviceName;
    private float usableArea;
    private double rentalCost;
    private int maximumNumberPeople;
    private RentType rentType;
    private static int number=1;
    private int id ;
    private FuramaServiceCode serviceCode;
    private int numBerBooking;

    public Facility(String serviceName, float usableArea, double rentalCost, int maximumNumberPeople,
                    RentType rentType, FuramaServiceCode serviceCode) {
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

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FuramaServiceCode getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(FuramaServiceCode serviceCode) {
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
