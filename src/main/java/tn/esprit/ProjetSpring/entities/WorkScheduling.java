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
public class WorkScheduling implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long workId;
    String phaseTitle;
    Date deadline;
    String status;

    @JsonIgnore
@OneToMany(mappedBy = "workScheduling")
List<Livrable> task;


@ManyToOne
    Project project;
}
