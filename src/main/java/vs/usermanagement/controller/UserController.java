package vs.usermanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vs.usermanagement.entities.User;
import vs.usermanagement.service.UserService;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("user")
    public List<User> getAll() {
        return userService.findAll();
    }

}
