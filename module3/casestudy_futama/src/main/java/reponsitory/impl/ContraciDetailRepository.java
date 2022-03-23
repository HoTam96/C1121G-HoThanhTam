package reponsitory.impl;

import Dbcontext.BaseRepository;
import model.contract.AttachService;
import model.contract.Contract;
import model.contract.ContractDetail;
import reponsitory.IContracDetailRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContraciDetailRepository implements IContracDetailRepository {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<ContractDetail> getListAll() {
        List<ContractDetail> list = new ArrayList<>();
        ContractRepository contractRepository = new ContractRepository();
        ContraciDetailRepository contraciDetailRepository = new ContraciDetailRepository();
        String query = "select * from detail_contract;";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Contract contract = contractRepository.checkContract(rs.getInt(2));
                AttachService attachService = contraciDetailRepository.attachService(rs.getInt(3));
                ContractDetail contractDetail = new ContractDetail(rs.getInt(1),
                        contract, attachService, rs.getInt(4));
                list.add(contractDetail);
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

        return list;
    }

    @Override
    public List<AttachService> getListAttach() {
        List<AttachService> list = new ArrayList<>();
        String query = "select * from accompanied_service";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                AttachService attachService = new AttachService(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5));
                list.add(attachService);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return list;


    }

    @Override
    public void insertInto(ContractDetail contractDetail) {
        String query = "  insert into detail_contract(contract_id,service_code,quantity)values(?,?,?)";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,contractDetail.getContractId().getContractId());
            ps.setInt(2,contractDetail.getServiceId().getId());
            ps.setInt(3,contractDetail.getQuantity());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    private AttachService attachService(int id) {
        String query = "select * from accompanied_service where service_code = ?;";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                AttachService attachService = new AttachService(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5));
                return attachService;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


}
