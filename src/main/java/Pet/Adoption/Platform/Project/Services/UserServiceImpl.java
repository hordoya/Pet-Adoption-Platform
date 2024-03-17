package Pet.Adoption.Platform.Project.Services;

import Pet.Adoption.Platform.Project.Models.User;
import Pet.Adoption.Platform.Project.Repositories.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private  UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public void createUser(User user) {


        userRepository.save(user);
    }
}
