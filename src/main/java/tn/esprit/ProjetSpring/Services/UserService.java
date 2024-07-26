package tn.esprit.ProjetSpring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ProjetSpring.Repositories.UserRepository;
import tn.esprit.ProjetSpring.entities.User;

import java.util.List;
@Service
@AllArgsConstructor
public class UserService implements IUserService{
     UserRepository userRepository;



    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(long idUser) {
        return userRepository.findById(idUser).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(long idUser) {
        userRepository.deleteById(idUser);
    }

    @Override
    public User updateUser(User user) {
        User us = userRepository.findById(user.getIdUser()).orElse(null);
        if (us != null)
            userRepository.save(user);

        return us;

    }
}
