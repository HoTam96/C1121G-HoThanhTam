package service;

import model.contract.AttachService;
import model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    List<ContractDetail> getListAll();

    List<AttachService> getListAttach();

    void insertInto(ContractDetail contractDetail);
}
