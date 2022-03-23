package model.DTO;

public class ContractUserServiceDTO {
    private String customerName;
    private Integer contractId;
    private Integer detailQuantity;
    private String attachService;

    public ContractUserServiceDTO(String customerName, Integer contractId, Integer detailQuantity, String attachService) {
        this.customerName = customerName;
        this.contractId = contractId;
        this.detailQuantity = detailQuantity;
        this.attachService = attachService;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getDetailQuantity() {
        return detailQuantity;
    }

    public void setDetailQuantity(Integer detailQuantity) {
        this.detailQuantity = detailQuantity;
    }

    public String getAttachService() {
        return attachService;
    }

    public void setAttachService(String attachService) {
        this.attachService = attachService;
    }

    @Override
    public String toString() {
        return "ContractUserService{" +
                "customerName='" + customerName + '\'' +
                ", contractId=" + contractId +
                ", detailQuantity=" + detailQuantity +
                ", AttachService='" + attachService + '\'' +
                '}';
    }
}
