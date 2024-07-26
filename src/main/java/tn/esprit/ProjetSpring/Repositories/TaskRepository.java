package tn.esprit.ProjetSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ProjetSpring.entities.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
