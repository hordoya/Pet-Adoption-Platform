package Pet.Adoption.Platform.Project.Services;

import Pet.Adoption.Platform.Project.Models.AdoptionRequest;
import Pet.Adoption.Platform.Project.Repositories.AdoptionRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdoptionRequestServiceImpl implements AdoptionRequestService{
    @Autowired
    private AdoptionRequestRepository adoptionRequestRepository;


    @Override
    public List<AdoptionRequest> getAllAdoption() {
        return this.adoptionRequestRepository.findAll();
    }

//    @Override
//    public void updateAdoptionRequest(AdoptionRequest adoptionRequest) {
//
//    }

    @Override
    public boolean deleteAdoptionRequest(Long id) {
        if (this.adoptionRequestRepository.findById(id).isPresent()){
            adoptionRequestRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
