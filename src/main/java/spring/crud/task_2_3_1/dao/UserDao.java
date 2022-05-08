package spring.crud.task_2_3_1.dao;

import spring.crud.task_2_3_1.model.User;

import java.util.List;


public interface UserDao {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(String id);

    void updateUser(String id);

    void deleteUser(String id);
}
