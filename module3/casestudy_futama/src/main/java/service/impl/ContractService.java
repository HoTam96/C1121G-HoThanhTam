package service.impl;

import model.contract.Contract;
import reponsitory.IContractRepository;
import reponsitory.impl.ContractRepository;
import service.IcontractService;

import java.util.List;

public class ContractService implements IcontractService {
    IContractRepository iContractRepository = new ContractRepository();

    @Override
    public List<Contract> getListAllContract() {
        return iContractRepository.getListAllContract();
    }

    @Override
    public Contract checkContract(Integer id) {
        return iContractRepository.checkContract(id);
    }

    @Override
    public void CreateNewContract(Contract contract) {
        iContractRepository.createContract(contract);
    }
}
