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

    @Override
    public List<User> getByName(String country, int index) {
        return iUserReponsitory.getByName(country,index);
    }

    @Override
    public int getCount(String name) {
        return iUserReponsitory.getCount(name);
    }

    @Override
    public User getUserById(int id) {
        return iUserReponsitory.getUserById(id);
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        iUserReponsitory.insertUserStore(user);

    }

    @Override
    public void addUserTransaction(User user, int[] permision) {
        iUserReponsitory.addUserTransaction( user, permision);

    }

    @Override
    public void insertUpdateWithoutTransaction() {
        iUserReponsitory.insertUpdateWithoutTransaction();
    }

    @Override
    public void insertUpdateUseTransaction() {


    }
}
