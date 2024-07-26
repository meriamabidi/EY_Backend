package tn.esprit.ProjetSpring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
long taskId;
    String title;
    int plannedDuration;
    Date dueDate;
    String description;
    String status;
    Date createdAt;
    String priority;


    @ManyToOne
    Livrable livrable;
}
