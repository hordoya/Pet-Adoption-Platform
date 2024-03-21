package Pet.Adoption.Platform.Project.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/admin/login")
    public String viewLogin(Model model) {
        return "login";
    }
}
