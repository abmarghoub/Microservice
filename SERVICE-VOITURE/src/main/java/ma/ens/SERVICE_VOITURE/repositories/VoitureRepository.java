package ma.ens.SERVICE_VOITURE.repositories;

import ma.ens.SERVICE_VOITURE.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository  extends JpaRepository<Voiture, Long> {
}
