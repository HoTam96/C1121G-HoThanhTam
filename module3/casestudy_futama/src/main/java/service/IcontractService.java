package service;

import model.contract.Contract;

import java.util.List;

public interface IcontractService {
    List<Contract> getListAllContract();

    Contract checkContract(Integer id);

    void CreateNewContract(Contract contract);
}
