package tn.esprit.ProjetSpring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@AllArgsConstructor
@NoArgsConstructor
public class Livrable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
long livrableId;
    String title;
    int plannedDuration;
    Date dueDate;
    String description;
   // String assignedTo;
    String priority;
    String status ;
    Date startDate;
    String link ;

    @JsonIgnore
@OneToMany(mappedBy = "livrable")
List<Task> taskList;

@ManyToOne
    WorkScheduling workScheduling;
@ManyToOne
    User user;

}
