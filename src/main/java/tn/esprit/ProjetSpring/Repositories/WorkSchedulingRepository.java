package tn.esprit.ProjetSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ProjetSpring.entities.WorkScheduling;

public interface WorkSchedulingRepository  extends JpaRepository<WorkScheduling,Long> {
}
