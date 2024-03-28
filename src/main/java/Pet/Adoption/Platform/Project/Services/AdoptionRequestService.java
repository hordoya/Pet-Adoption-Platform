package Pet.Adoption.Platform.Project.Services;

import Pet.Adoption.Platform.Project.Models.AdoptionRequest;
import Pet.Adoption.Platform.Project.Repositories.AdoptionRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdoptionRequestService {


     List<AdoptionRequest> getAllAdoption() ;

//    void updateAdoptionRequest(AdoptionRequest adoptionRequest);

    boolean deleteAdoptionRequest(Long id);

}
