package tn.esprit.ProjetSpring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.jdbc.Work;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long projectId;
    String projectName;
    String clientName;
    String status;
    float price ;
    String description;
    float budget;
    String goals;
    String scope;
    String boundaries;
    Date startDate;
    Date dueDate;
    int estimatedDuration;

    @JsonIgnore
    @OneToMany(mappedBy = "project")
    List<WorkScheduling> workSchedulingList;
}
