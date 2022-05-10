package spring.crud.task_2_3_1.service;

import spring.crud.task_2_3_1.model.User;

import java.util.List;


public interface UserService {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUser(User user);

    void deleteUser(long id);

}
