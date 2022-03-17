package reposotory;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserReponsitory {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;
    public List<User> getByName(String country,int index);

  public int getCount(String name );
    User getUserById(int id);
    void insertUserStore(User user) throws SQLException;

    void addUserTransaction(User user, int[] permision);
    void  insertUpdateWithoutTransaction();
    public void insertUpdateUseTransaction();




}
