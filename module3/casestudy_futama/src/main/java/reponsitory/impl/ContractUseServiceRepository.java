package reponsitory.impl;

import Dbcontext.BaseRepository;
import model.DTO.ContractUserServiceDTO;
import reponsitory.IContractUseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ContractUseServiceRepository implements IContractUseRepository {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<ContractUserServiceDTO> getAllContractUseService() {
        List<ContractUserServiceDTO> userServiceDTOList = new ArrayList<>();
        String query = "select c_name, contract.contract_id, detail_contract.quantity,accompanied_service.name_service from customer join\n" +
                "contract on contract.customer_id = customer.customer_id join\n" +
                "detail_contract on detail_contract.contract_id = contract.contract_id join\n" +
                "accompanied_service on accompanied_service.service_code = detail_contract.service_code group by contract_id";

        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                ContractUserServiceDTO contractUserServiceDTO = new ContractUserServiceDTO(rs.getString(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4));
                userServiceDTOList.add(contractUserServiceDTO);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return userServiceDTOList;
    }
}
