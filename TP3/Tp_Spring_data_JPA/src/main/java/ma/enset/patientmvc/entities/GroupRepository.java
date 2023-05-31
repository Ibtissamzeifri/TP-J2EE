package ma.enset.patientmvc.entities;

import org.apache.catalina.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Groupe,Long> {
    Groupe findByGroupName(String name);
}
