package tn.esprit.ProjetSpring.Services;

import tn.esprit.ProjetSpring.entities.WorkScheduling;

import java.util.List;

public interface IWorkSchedulingService {
    WorkScheduling addWorkScheduling(WorkScheduling workScheduling,long id);
    WorkScheduling getWorkScheduling(long id);
    List<WorkScheduling> getAllWorkSchedulings();
    void deleteWorkScheduling(long idWorkScheduling);
    WorkScheduling updateWorkScheduling(WorkScheduling WorkScheduling);
}
