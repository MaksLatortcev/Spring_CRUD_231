package spring.crud.task_2_3_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.crud.task_2_3_1.dao.UserDao;
import spring.crud.task_2_3_1.model.User;

import java.util.List;


@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(String id) {
        return userDao.getUserById(id);
    }

    @Override
    public void updateUser(String id) {
        userDao.updateUser(id);
    }

    @Override
    public void deleteUser(String id) {


    }
}
