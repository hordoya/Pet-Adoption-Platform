package Pet.Adoption.Platform.Project.Services;

import Pet.Adoption.Platform.Project.Models.Pet;
import Pet.Adoption.Platform.Project.Repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImpl implements PetService {
    @Autowired
    private PetRepository petRepository;
    @Override
    public void addPet(Pet pet) {
        petRepository.save(pet);
    }

    @Override
    public List<Pet> findAll() {
        return petRepository.findAll();
    }
    @Override
    public Boolean deletePetById(Long id) {
        if (petRepository.existsById(id)){
            petRepository.deleteById(id);
            return true;
        } else{
            return false;
        }
    }
    @Override
    public Pet findPetById(Long id) {
        return this.petRepository.findById(id).orElse(null);
    }
    @Override
    public void movePetToAdopted(Long petId) {
        Optional<Pet> optionalPet = petRepository.findById(petId); // Find the pet by ID

        if (optionalPet.isPresent()) {
            Pet petToMove = optionalPet.get(); // Unwrap the Optional to retrieve the Pet object
            petToMove.setAdopted(true); // Set the adopted status to true
            petRepository.save(petToMove); // Save the updated pet
        }
    }
@Override
    public List<Pet> getAllAdoptedPets() {
        List<Pet> allPets = petRepository.findAll();
        List<Pet> adoptedPets = new ArrayList<>();

        for (Pet pet : allPets) {
            if (pet.isAdopted()) {
                adoptedPets.add(pet);
            }
        }

        return adoptedPets;
    }

}
