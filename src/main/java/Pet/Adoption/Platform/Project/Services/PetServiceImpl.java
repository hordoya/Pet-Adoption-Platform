package Pet.Adoption.Platform.Project.Services;

import Pet.Adoption.Platform.Project.Models.Pet;
import Pet.Adoption.Platform.Project.Repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
