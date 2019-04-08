package vs.usermanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vs.usermanagement.entities.User;
import vs.usermanagement.exception.UserNotFoundException;
import vs.usermanagement.service.UserService;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity getAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity findUser(@PathVariable int id) {
        var found = userService.findById(id);
        if (found.isPresent()) {
            return ResponseEntity.ok(found.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }

}
