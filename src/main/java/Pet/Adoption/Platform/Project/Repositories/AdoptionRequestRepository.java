package Pet.Adoption.Platform.Project.Repositories;

import Pet.Adoption.Platform.Project.Models.AdoptionRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdoptionRequestRepository extends JpaRepository<AdoptionRequest,Long> {
}
