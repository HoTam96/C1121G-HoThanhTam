package service.impl;

import model.contract.AttachService;
import model.contract.ContractDetail;
import reponsitory.IContracDetailRepository;
import reponsitory.impl.ContraciDetailRepository;
import service.IContractDetailService;

import java.util.List;

public class ContractDetailService implements IContractDetailService {
    IContracDetailRepository iContracDetailRepository = new ContraciDetailRepository();

    @Override
    public List<ContractDetail> getListAll() {
        return iContracDetailRepository.getListAll();
    }

    @Override
    public List<AttachService> getListAttach() {
        return iContracDetailRepository.getListAttach();
    }

    @Override
    public void insertInto(ContractDetail contractDetail) {
        iContracDetailRepository.insertInto(contractDetail);
    }
}
