package tn.esprit.ProjetSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ProjetSpring.entities.Livrable;

public interface LivrableRepository extends JpaRepository<Livrable,Long> {
}
