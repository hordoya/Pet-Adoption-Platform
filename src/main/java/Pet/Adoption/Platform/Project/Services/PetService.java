package Pet.Adoption.Platform.Project.Services;

import Pet.Adoption.Platform.Project.Models.Pet;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface PetService {
    void addPet(Pet pet);
    List<Pet> findAll();
    Boolean deletePetById(Long id);
    Pet findPetById(Long id);
    void movePetToAdopted(Long petId);
    List<Pet> getAllAdoptedPets();

}
