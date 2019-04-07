package vs.usermanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vs.usermanagement.entities.User;
import vs.usermanagement.exception.UserNotFoundException;
import vs.usermanagement.service.UserService;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("user/{id}")
    public User findUser(@PathVariable int id) {
        try {
            return userService.findById(id).orElseThrow(() -> new UserNotFoundException("user not found"));
        } catch (UserNotFoundException e) {
            // TODO Auto-generated catch block
            User notFound = new User();
            notFound.setName("not found");
            return notFound;
        }
    }

}
