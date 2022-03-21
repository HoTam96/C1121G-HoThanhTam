package model.service;

public class ServiceType {
    private Integer serviceTypeId;
    public String serviceName;

    public ServiceType(Integer serviceTypeId, String serviceName) {
        this.serviceTypeId = serviceTypeId;
        this.serviceName = serviceName;
    }

    public ServiceType() {
    }

    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "ServiceType{" +
                "serviceTypeId=" + serviceTypeId +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
