package tn.esprit.ProjetSpring.Services;

import tn.esprit.ProjetSpring.entities.User;

import java.util.List;

public interface IUserService {
    User addUser(User user);

    User getUser (long idUser);

    List<User> getAllUsers();

    void deleteUser (long idUser);

    User updateUser (User user);

}
