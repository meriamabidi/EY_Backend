package tn.esprit.ProjetSpring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ProjetSpring.Repositories.ProjectRepository;
import tn.esprit.ProjetSpring.Repositories.WorkSchedulingRepository;
import tn.esprit.ProjetSpring.entities.Project;
import tn.esprit.ProjetSpring.entities.WorkScheduling;

import java.util.List;
@Service
@AllArgsConstructor
public class WorkSchedulingService implements IWorkSchedulingService{
    WorkSchedulingRepository workSchedulingRepository;
ProjectRepository projectRepository;

    @Override
    public WorkScheduling addWorkScheduling(WorkScheduling workScheduling,long id) {
        Project p = projectRepository.findById(id).orElse(null);
        workScheduling.setProject(p);
        return workSchedulingRepository.save(workScheduling);
    }

    @Override
    public WorkScheduling getWorkScheduling(long id) {
        return workSchedulingRepository.findById(id).orElse(null);
    }

    @Override
    public List<WorkScheduling> getAllWorkSchedulings() {
        return workSchedulingRepository.findAll();
    }

    @Override
    public void deleteWorkScheduling(long idWorkScheduling) {
        workSchedulingRepository.deleteById(idWorkScheduling);

    }

    @Override
    public WorkScheduling updateWorkScheduling(WorkScheduling workScheduling) {
        WorkScheduling ch=workSchedulingRepository.findById(workScheduling.getWorkId()).orElse(null);
        if (ch!=null)
            workSchedulingRepository.save(workScheduling);
        return  ch;    }
}
