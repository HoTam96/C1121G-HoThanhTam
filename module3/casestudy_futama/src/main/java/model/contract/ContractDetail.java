package model.contract;

import model.service.Service;

public class ContractDetail {
    private Integer detailId;
    private Contract contractId;
    private AttachService serviceId;
    private  Integer quantity;

    public ContractDetail(Integer detailId, Contract contractId, AttachService serviceId, Integer quantity) {
        this.detailId = detailId;
        this.contractId = contractId;
        this.serviceId = serviceId;
        this.quantity = quantity;
    }

    public ContractDetail(Contract contractId, AttachService serviceId, Integer quantity) {
        this.contractId = contractId;
        this.serviceId = serviceId;
        this.quantity = quantity;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Contract getContractId() {
        return contractId;
    }

    public void setContractId(Contract contractId) {
        this.contractId = contractId;
    }

    public AttachService getServiceId() {
        return serviceId;
    }

    public void setServiceId(AttachService serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
