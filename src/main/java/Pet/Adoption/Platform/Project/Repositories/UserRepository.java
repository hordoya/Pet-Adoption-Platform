package Pet.Adoption.Platform.Project.Repositories;

import Pet.Adoption.Platform.Project.Models.User;
import Pet.Adoption.Platform.Project.Services.UserService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByname(String name);

}
