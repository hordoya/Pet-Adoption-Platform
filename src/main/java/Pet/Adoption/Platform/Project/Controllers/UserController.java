package Pet.Adoption.Platform.Project.Controllers;

import Pet.Adoption.Platform.Project.Services.UserService;
import Pet.Adoption.Platform.Project.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String createUser(@ModelAttribute("user") User user, BindingResult bindingResult, RedirectAttributes redirectAttributes){
//        this.userService.createUser(user);
//        return "redirect:/login";
        if (bindingResult.hasErrors()) {
            return "/Registration";
        }

        User existingUser = userService.getUserByname(user.getName());
        if (existingUser != null) {
//            System.out.println(existingUser.getName());
            redirectAttributes.addFlashAttribute("message", "Username already exists.");
            return "redirect:/Registration";
        }

        userService.createUser(user);
        redirectAttributes.addFlashAttribute("message", "User successfully registered!");
        return "redirect:/login";
    }
    @GetMapping("/register")
    public String viewRegister(Model model) {
        model.addAttribute("user", new User());
        return "/Registration";
    }

    @GetMapping("/home")
    public String viewHome(Model model) {


        return "home";
    }
}
