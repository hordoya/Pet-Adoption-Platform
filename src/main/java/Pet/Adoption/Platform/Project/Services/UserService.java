package Pet.Adoption.Platform.Project.Services;

import Pet.Adoption.Platform.Project.Models.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List<User> getAllUsers();
    void createUser(User user);
    void disableUserAccount(Long userId);
    User getUserByname(String name);

}
