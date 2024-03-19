package Pet.Adoption.Platform.Project.Controllers;

import Pet.Adoption.Platform.Project.Models.Pet;
import Pet.Adoption.Platform.Project.Models.User;
import Pet.Adoption.Platform.Project.Services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PetController {
    @Autowired
    private PetService petService;
    @PostMapping("/pet/addPet")
    public ResponseEntity<String> addPet(@RequestBody Pet pet){
        this.petService.addPet(pet);
        return new ResponseEntity<>("pet added Successfully.", HttpStatus.OK);
    }

}
