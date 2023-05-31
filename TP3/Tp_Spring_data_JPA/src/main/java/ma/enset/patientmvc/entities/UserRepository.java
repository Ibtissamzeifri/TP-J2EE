package ma.enset.patientmvc.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Utilisateur,Long>{
    Utilisateur findByUserName(String name);
}
