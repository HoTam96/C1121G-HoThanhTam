package model.service;

public class RentType {
    private Integer rentTypeId;
    private String rentTypeName;
    private double rentTypeCost;

    public RentType(Integer rentTypeId, String rentTypeName, double rentTypeCost) {
        this.rentTypeId = rentTypeId;
        this.rentTypeName = rentTypeName;
        this.rentTypeCost = rentTypeCost;
    }

    public Integer getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(Integer rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public double getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(double rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }

    @Override
    public String toString() {
        return "RentType{" +
                "rentTypeId=" + rentTypeId +
                ", rentTypeName='" + rentTypeName + '\'' +
                ", rentTypeCost=" + rentTypeCost +
                '}';
    }
}
