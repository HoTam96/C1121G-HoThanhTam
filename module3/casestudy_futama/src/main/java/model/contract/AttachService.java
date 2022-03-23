package model.contract;

public class AttachService {
    private Integer id;
    private  String name;
    private  double cost;
    private String serviceUnit;
    private String serviceStatus;

    public AttachService(Integer id, String name, double cost, String serviceUnit, String serviceStatus) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.serviceUnit = serviceUnit;
        this.serviceStatus = serviceStatus;
    }

    public AttachService() {
    }

    public AttachService(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getServiceUnit() {
        return serviceUnit;
    }

    public void setServiceUnit(String serviceUnit) {
        this.serviceUnit = serviceUnit;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }


}
