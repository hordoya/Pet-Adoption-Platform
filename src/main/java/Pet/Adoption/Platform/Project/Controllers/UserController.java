package Pet.Adoption.Platform.Project.Controllers;

import Pet.Adoption.Platform.Project.Services.UserService;
import Pet.Adoption.Platform.Project.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getAllUsers(){

        return this.userService.getAllUsers();
    }
    @PostMapping("/register")
    public ResponseEntity<String> createUser(@RequestBody User user){
        this.userService.createUser(user);
        return new ResponseEntity<>("user added Successfully.", HttpStatus.OK);
    }
}
