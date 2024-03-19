package Pet.Adoption.Platform.Project.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/login")
    public String viewLogin(Model model) {
        return "login";
    }
}
