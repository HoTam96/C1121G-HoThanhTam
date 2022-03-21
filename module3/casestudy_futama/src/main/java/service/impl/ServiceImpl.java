package service.impl;

import model.service.RentType;
import model.service.Service;
import model.service.ServiceType;
import reponsitory.IServiceRepository;
import reponsitory.impl.ServiceRepository;
import service.IService;

import java.util.List;

public class ServiceImpl implements IService {
    IServiceRepository iServiceRepository = new ServiceRepository();

    @Override
    public List<RentType> getListRenType() {
        return iServiceRepository.getListRenType();
    }

    @Override
    public List<ServiceType> getListServiceType() {
        return iServiceRepository.getListServiceType();
    }

    @Override
    public List<Service> getAllService() {
        return iServiceRepository.getAllService();
    }

    @Override
    public void newCreate(Service service) {
        iServiceRepository.newCreate(service);
    }

    @Override
    public Service checkId(Integer serviceId) {
        return iServiceRepository.checkId(serviceId);
    }
}