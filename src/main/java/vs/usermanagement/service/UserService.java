package vs.usermanagement.service;

import org.springframework.stereotype.Service;
import vs.usermanagement.entities.User;
import vs.usermanagement.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

}
