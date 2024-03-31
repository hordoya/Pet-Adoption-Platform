package Pet.Adoption.Platform.Project.Services;

import Pet.Adoption.Platform.Project.Models.User;
import Pet.Adoption.Platform.Project.Repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }
    @Override
    public void disableUserAccount(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setEnabled(false); // Set user's enabled status to false (disabled)
            userRepository.save(user);
        } else {
            throw new RuntimeException("User not found with ID: " + userId);
        }
    }
    @Override
    public User getUserByname(String name) {
        return userRepository.findByname(name);
    }
}
