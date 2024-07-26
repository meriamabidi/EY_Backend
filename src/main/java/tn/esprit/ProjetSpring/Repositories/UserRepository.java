package tn.esprit.ProjetSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ProjetSpring.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
