package spring.crud.task_2_3_1.dao;

import org.springframework.stereotype.Repository;
import spring.crud.task_2_3_1.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;

    @Override
    public void saveUser(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public void updateUser(String id) {

    }

    @Override
    public void deleteUser(String id) {

    }
}
