package tn.esprit.ProjetSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ProjetSpring.entities.Project;

public interface ProjectRepository  extends JpaRepository<Project,Long> {
}
