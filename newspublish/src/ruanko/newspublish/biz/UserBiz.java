package ruanko.newspublish.biz;

import java.util.List;

import ruanko.newspublish.dao.UserDao;
import ruanko.newspublish.entity.Article;
import ruanko.newspublish.entity.User;

public class UserBiz {
    private UserDao userDao;

    public UserBiz() {
        this.userDao = new UserDao();
    }
    /**
     添加用户
     */
    public void addUser(User user) {
        userDao.addUser(user);
    }

    /**
     删除用户
     */
    public void deleteUser(int id){userDao.deleteUser(id);}

    /**
     修改用户信息
     */
    public void updateUser(User user){userDao.updateUser(user);}

    /**
     得到一个用户信息
     */
    public User getByName(String username) {
        return userDao.getByName(username);
    }
    public User get(int id) {
        return userDao.get(id);
    }

    /**
     得到所有用户信息
     */
    public List<User> getUserAll(){
        return userDao.getUserAll();
    }
}
