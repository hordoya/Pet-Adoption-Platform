package Pet.Adoption.Platform.Project.Controllers;

import Pet.Adoption.Platform.Project.Models.AdoptionRequest;
import Pet.Adoption.Platform.Project.Models.User;
import Pet.Adoption.Platform.Project.Services.AdoptionRequestService;
import Pet.Adoption.Platform.Project.Services.PetService;
import Pet.Adoption.Platform.Project.Services.UserService;
import Pet.Adoption.Platform.Project.Models.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")

public class AdminController {
    @Autowired
    private PetService petService;

    @Autowired
    private UserService userService;

    @Autowired
    private AdoptionRequestService adoptionRequestService;

    // Endpoint to list all pets
    @GetMapping("/pets")
    public List<Pet> getAllPets() {
        return petService.findAll();
    }

    // Endpoint to approve a pet listing


    // Endpoint to list all users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Endpoint to disable a user account
    @PostMapping("/disableUser/{userId}")
    public ResponseEntity<String> disableUserAccount(@PathVariable Long userId) {
        userService.disableUserAccount(userId);
        return ResponseEntity.ok("User account disabled successfully.");
    }

    // Endpoint to list all adoption requests
    @GetMapping("/adoptionRequests")
    public List<AdoptionRequest> getAllAdoptionRequests() {
        return adoptionRequestService.getAllAdoption();
    }

    // Endpoint to review an adoption request

}
