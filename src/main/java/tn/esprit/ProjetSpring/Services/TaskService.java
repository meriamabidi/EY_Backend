package tn.esprit.ProjetSpring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ProjetSpring.Repositories.TaskRepository;
import tn.esprit.ProjetSpring.Repositories.LivrableRepository;
import tn.esprit.ProjetSpring.entities.Task;
import tn.esprit.ProjetSpring.entities.Livrable;

import java.util.List;
@Service
@AllArgsConstructor
public class TaskService implements ITaskService {
    TaskRepository taskRepository;
    LivrableRepository livrableRepository ;

    @Override
    public Task addTask(Task task, long id ) {
        Livrable t = livrableRepository.findById(id).orElse(null);
        task.setLivrable(t);
        return taskRepository.save(task);

    }

    @Override
    public Task getTask(long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public void deleteTask(long idTask) {
        taskRepository.deleteById(idTask);

    }

    @Override
    public Task updateTask(Task task) {
        Task ch= taskRepository.findById(task.getTaskId()).orElse(null);
        if (ch!=null)
            taskRepository.save(task);
        return  ch;    }
}


