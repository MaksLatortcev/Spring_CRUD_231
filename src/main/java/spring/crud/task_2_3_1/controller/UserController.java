package spring.crud.task_2_3_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import spring.crud.task_2_3_1.model.User;
import spring.crud.task_2_3_1.service.UserService;
import spring.crud.task_2_3_1.service.UserServiceImp;


@Controller
public class UserController{

    @Autowired
    private UserService userService;

//    public String newCustomerForm(Map<String, Object> model) {
//        Customer customer = new Customer();
//        model.put("customer", customer);
//        return "new_customer";
//    }

    @GetMapping("/new")
    public String saveUser(User user) {
        return "new_user";
    }

    @GetMapping("/")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }


    public String getUserById(String id) {
        return null;
    }


    public String updateUser(String id) {
        return null;
    }


    public String deleteUser(String id) {
        return null;
    }
}
