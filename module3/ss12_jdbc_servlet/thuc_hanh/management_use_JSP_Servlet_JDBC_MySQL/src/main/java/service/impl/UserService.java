package service.impl;

import model.User;
import reposotory.IUserReponsitory;
import reposotory.UserReponsitory;
import service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    IUserReponsitory iUserReponsitory = new UserReponsitory();

    @Override
    public void insertUser(User user) throws SQLException {
        iUserReponsitory.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return iUserReponsitory.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return iUserReponsitory.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return iUserReponsitory.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return iUserReponsitory.updateUser(user);
    }
}
