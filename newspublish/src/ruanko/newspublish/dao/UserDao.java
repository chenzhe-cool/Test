package ruanko.newspublish.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;
//import java.util.List;

import ruanko.newspublish.entity.Article;
import ruanko.newspublish.entity.User;
import ruanko.newspublish.util.*;

public class UserDao extends BaseDao{

    /*添加用户*/
    public void addUser(User user) {
        String sql = "INSERT INTO user(username, password,sex,arrive,beizhu) VALUES('" +
                user.getUsername() +
                "','" +
                Encrypt.encodeMD5(user.getPassword()) +
                "','" +
                user.getSex() +
                "','" +
                user.getArrive() +
                "','" +
                user.getBeizhu() +
                "')";
        executeUpdate(sql);
    }

    /**
    *删除用户
     */
    public void deleteUser(int id) {
        String sql = "DELETE FROM user WHERE id=" + id;
        executeUpdate(sql);
    }

    /**
     *修改用户信息
      */
    public void updateUser(User user) {
        String sql = "UPDATE user SET sex='" +
                user.getSex() +
                "', arrive='" +
                user.getArrive() +
                "', beizhu='" +
                user.getBeizhu() +
                "' WHERE id=" + user.getId();
        executeUpdate(sql);
    }

    /**
    按照用户名查找用户
     */
    public User getByName(String username) {

        String sql = "SELECT * FROM user WHERE username=" +"'"+ username + "'";

        Connection connection = getConnection();
        Statement statement;
        try {
            statement = connection.createStatement();  //用于创建一个 Statement 对象，封装 SQL 语句发送给数据库.
            ResultSet resultSet = statement.executeQuery(sql);   //执行sql语句
            if (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setSex(resultSet.getString("sex"));
                user.setArrive(resultSet.getString("arrive"));
                user.setBeizhu(resultSet.getString("beizhu"));

                closeAll(connection, statement, resultSet);
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     按照用户名查找用户
     */
    public User get(int id) {

        String sql = "SELECT * FROM user WHERE id=" + id;
        Connection connection = getConnection();
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setSex(resultSet.getString("sex"));
                user.setArrive(resultSet.getString("arrive"));
                user.setBeizhu(resultSet.getString("beizhu"));

                closeAll(connection, statement, resultSet);
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
    //得到所有用户信息
     */
    public List<User> getUserAll(){
        List<User> users;
        String sql = "SELECT * FROM user";
        Connection connection = getConnection();
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            users = new ArrayList<User>();
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setSex(resultSet.getString("sex"));
                user.setArrive(resultSet.getString("arrive"));
                user.setBeizhu(resultSet.getString("beizhu"));
                users.add(user);
            }
            closeAll(connection, statement, resultSet);
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
