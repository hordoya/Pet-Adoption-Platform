package Pet.Adoption.Platform.Project.Controllers;

import Pet.Adoption.Platform.Project.Models.Pet;
import Pet.Adoption.Platform.Project.Models.User;
import Pet.Adoption.Platform.Project.Services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class PetController {
    @Autowired
    private PetService petService;
//    @PostMapping("/pet/addPet")
//    public String addPet(@RequestBody Pet pet){
//        this.petService.addPet(pet);
////        return new ResponseEntity<>("pet added Successfully.", HttpStatus.OK);
//        return "allpet";
//    }
    @PostMapping("/pet/addPet")
    public String createPet(@ModelAttribute("pet") Pet pet){
        petService.addPet(pet);
        return "redirect:/login";
    }
    @GetMapping("/pet/addPet")
    public String viewRegister(Model model) {
        model.addAttribute("pet", new Pet());
        return "/PetRegistration";
    }
    @GetMapping("/allPet")
    public String findAll(Model model) {
        List<Pet> pets = petService.findAll();

        model.addAttribute("pets", pets);
        return "allPet";
    }

}
