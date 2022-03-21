package reponsitory;

import model.service.RentType;
import model.service.Service;
import model.service.ServiceType;

import java.util.List;

public interface IServiceRepository {
    List<RentType> getListRenType();

    List<ServiceType> getListServiceType();

    List<Service> getAllService();

    void newCreate(Service service);

    Service checkId(Integer serviceId);
}
