package spring.crud.task_2_3_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import spring.crud.task_2_3_1.model.User;
import spring.crud.task_2_3_1.service.UserService;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/new")
    public String newUserForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "new_user";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
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
