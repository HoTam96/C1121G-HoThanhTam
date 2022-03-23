package reponsitory;

import model.contract.Contract;

import java.util.List;

public interface IContractRepository {
    List<Contract> getListAllContract();

    Contract checkContract(Integer id);

    void createContract(Contract contract);
}
