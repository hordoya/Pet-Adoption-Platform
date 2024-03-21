package Pet.Adoption.Platform.Project.Controllers;

import Pet.Adoption.Platform.Project.Services.UserService;
import Pet.Adoption.Platform.Project.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }
    @GetMapping("/login")
    public String viewLogin(Model model) {
        return "login";
    }
    @PostMapping("/register")
    public String createUser(@ModelAttribute("user") User user){
        this.userService.createUser(user);
        return "redirect:/login";
    }
    @GetMapping("/register")
    public String viewRegister(Model model) {
        model.addAttribute("user", new User());
        return "/Registration";
    }
}
