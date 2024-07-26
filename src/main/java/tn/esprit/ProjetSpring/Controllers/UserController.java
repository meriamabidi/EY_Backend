package tn.esprit.ProjetSpring.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ProjetSpring.Services.IUserService;
import tn.esprit.ProjetSpring.entities.User;

import java.util.List;

@RestController
@AllArgsConstructor

public class UserController {
    IUserService userService ;

    @PostMapping("/adduser")
    User addUser(@RequestBody User user){

        return userService.addUser(user);
    }

    @GetMapping("/user/{id}")
    User retrieveUser (@PathVariable Long id){

        return userService.getUser(id);
    }

    @GetMapping("/users")
    List<User> retreiveUsers(){

        return userService.getAllUsers();
    }

    @DeleteMapping("/deleteuser/{id}")

    void deleteUser (@PathVariable Long id){
        userService.deleteUser(id);
    }

    @PutMapping("/updateuser")
    User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }


}
