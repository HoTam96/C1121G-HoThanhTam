package case_study.module.module_Furama;

public class FuramaServiceCode {
    private String serviceCodeName;

    public FuramaServiceCode(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
    }

    public String getServiceCodeName() {
        return serviceCodeName;
    }

    public void setServiceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
    }

    @Override
    public String toString() {
        return "serviceName='" + serviceCodeName + '\'' +
                '}';
    }
}
