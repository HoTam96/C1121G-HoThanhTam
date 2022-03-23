package reponsitory.impl;

import Dbcontext.BaseRepository;
import model.service.RentType;
import model.service.Service;
import model.service.ServiceType;
import reponsitory.IServiceRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepository implements IServiceRepository {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;


    @Override
    public List<RentType> getListRenType() {
        List<RentType> renTypeList = new ArrayList<>();
        String query = "select * from type_rent";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                RentType rentType = new RentType(rs.getInt(1), rs.getString(2), rs.getDouble(3));
                renTypeList.add(rentType);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return renTypeList;
    }

    @Override
    public List<ServiceType> getListServiceType() {
        List<ServiceType> serviceTypes = new ArrayList<>();
        String query = "select * from type_service;";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                ServiceType serviceType = new ServiceType(rs.getInt(1), rs.getString(2));
                serviceTypes.add(serviceType);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return serviceTypes;
    }

    @Override
    public List<Service> getAllService() {
        ServiceRepository serviceRepository = new ServiceRepository();
        List<Service> serviceList = new ArrayList<>();
        String query = "select*from service;";
        conn = BaseRepository.getConnection();
        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Service service = new Service(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getDouble(4), rs.getInt(5), serviceRepository.rentTypeId(rs.getInt(6)),
                        serviceRepository.serviceTypeId(rs.getInt(7)), rs.getString(8), rs.getString(9),
                        rs.getDouble(10), rs.getInt(11));
                serviceList.add(service);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return serviceList;
    }

    @Override
    public void newCreate(Service service) {
        String query = "insert into service values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, service.getServiceId());
            ps.setString(2, service.getServiceName());
            ps.setInt(3, service.getServiceArea());
            ps.setDouble(4, service.getRentalCost());
            ps.setInt(5, service.getPeopleMax());
            ps.setInt(6, service.getRenTypeId().getRentTypeId());
            ps.setInt(7, service.getServiceTypeId().getServiceTypeId());
            ps.setString(8, service.getStandardRoom());
            ps.setString(9, service.getDescriptionOther());
            ps.setDouble(10, service.getAreaPool());
            ps.setInt(11, service.getNumberFloor());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public Service checkId(Integer serviceId) {
        String query = "   select * from service where service_id=?;";
        ServiceRepository serviceRepository = new ServiceRepository();
        Service service = null;
        conn = BaseRepository.getConnection();
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, serviceId);
            rs = ps.executeQuery();
            while (rs.next()) {
                service = new Service(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getDouble(4), rs.getInt(5), serviceRepository.rentTypeId(rs.getInt(6)),
                        serviceRepository.serviceTypeId(rs.getInt(7)), rs.getString(8), rs.getString(9),
                        rs.getDouble(10), rs.getInt(11));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return service;
    }

    //lất theo id
    private RentType rentTypeId(int id) {
        RentType rentType = null;
        String query = "select * from type_rent where type_rent_id =?";
        conn = BaseRepository.getConnection();
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                rentType = new RentType(rs.getInt(1), rs.getString(2), rs.getDouble(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rentType;

    }

    private ServiceType serviceTypeId(int id) {
        ServiceType serviceType = null;
        String query = "select * from type_service where type_service_id =?";
        conn = BaseRepository.getConnection();
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                serviceType = new ServiceType(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return serviceType;

    }

}
