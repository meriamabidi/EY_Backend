package tn.esprit.ProjetSpring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ProjetSpring.Repositories.LivrableRepository;
import tn.esprit.ProjetSpring.Repositories.WorkSchedulingRepository;
import tn.esprit.ProjetSpring.entities.Livrable;
import tn.esprit.ProjetSpring.entities.WorkScheduling;

import java.util.List;
@Service
@AllArgsConstructor
public class LivrableService implements ILivrableService {
    LivrableRepository taskRepository;
WorkSchedulingRepository workSchedulingRepository;
    @Override
    public Livrable addLivrable(Livrable task, long id ) {
        WorkScheduling w = workSchedulingRepository.findById(id).orElse(null);
        task.setWorkScheduling(w);
        return taskRepository.save(task);

    }

    @Override
    public Livrable getLivrable(long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public List<Livrable> getAllLivrables() {
        return taskRepository.findAll();
    }

    @Override
    public void deleteLivrable(long idLivrable) {
        taskRepository.deleteById(idLivrable);

    }

    @Override
    public Livrable updateLivrable(Livrable task) {
        Livrable ch=taskRepository.findById(task.getLivrableId()).orElse(null);
        if (ch!=null)
            taskRepository.save(task);
        return  ch;    }

    @Override
    public Livrable deleteDeliverable(long id) {
        Livrable t=taskRepository.findById(id).orElse(null);
        if (t!=null){
            t.setLink(null);
            taskRepository.save(t);
        }
        return  t;
    }

    @Override
    public Livrable addDeliverable(long id, String deliverable) {
        Livrable t=taskRepository.findById(id).orElse(null);
        if (t!=null){
            t.setLink(deliverable);
            taskRepository.save(t);
        }
        return  t;
    }
}
