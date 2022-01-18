package case_study.module.module_Furama;

public class Room extends ResortFurama {
    private String freeService;

    public Room(String serviceName, float usableArea, double rentalCost, int maximumNumberPeople, RentType rentType, String freeService) {
        super(serviceName, usableArea, rentalCost, maximumNumberPeople, rentType);
        this.freeService = freeService;
    }

    public Room() {
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

}
