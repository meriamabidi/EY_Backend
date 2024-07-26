package tn.esprit.ProjetSpring.Services;

import tn.esprit.ProjetSpring.entities.Task;

import java.util.List;

public interface ITaskService {
    Task addTask(Task task, long id);
    Task getTask(long id);
    List<Task> getAllTasks();
    void deleteTask(long idTask);
    Task updateTask(Task Task);
}
