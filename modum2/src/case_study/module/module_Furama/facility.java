package case_study.module.module_Furama;

public abstract class facility {
    private String serviceName;
    private float usableArea;
    private double rentalCost;
    private int maximumNumberPeople;
    private RentType rentType;

    public facility(String serviceName, float usableArea, double rentalCost, int maximumNumberPeople, RentType rentType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maximumNumberPeople = maximumNumberPeople;
        this.rentType = rentType;
    }

    public facility() {
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

    @Override
    public String toString() {
        return "ResortFurama{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maximumNumberPeople=" + maximumNumberPeople +
                ", rentType=" + rentType +
                '}';
    }
}
