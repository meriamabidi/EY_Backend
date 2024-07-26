package tn.esprit.ProjetSpring.entities;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idUser;

    String firstName;
    String lastName;
    String password;
    long phone;
    String verifPassword;

    @Column(unique = true)
    String email;
    @Column(unique = true)
    long cin;

    Date dateNaissance=new Date();

    boolean active;



    @Enumerated(EnumType.STRING)
     Role role;

     @OneToMany(mappedBy = "user")
    List<Livrable> taskList;
}
