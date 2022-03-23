package service.impl;

import model.DTO.ContractUserServiceDTO;
import reponsitory.IContractUseRepository;
import reponsitory.impl.ContractUseServiceRepository;
import service.IContractUseService;

import java.util.List;

public class ContracUseService implements IContractUseService {
    IContractUseRepository iContractUseRepository = new ContractUseServiceRepository();
    @Override
    public List<ContractUserServiceDTO> getAllContractUseService() {
        return iContractUseRepository.getAllContractUseService();
    }
}
