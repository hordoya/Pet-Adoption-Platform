package Pet.Adoption.Platform.Project.Services;

import Pet.Adoption.Platform.Project.Models.User;
import Pet.Adoption.Platform.Project.Repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
