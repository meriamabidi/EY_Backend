package tn.esprit.ProjetSpring.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ProjetSpring.Services.ITaskService;
import tn.esprit.ProjetSpring.entities.Task;

import java.util.List;

@RestController
@AllArgsConstructor
public class TaskController {
    ITaskService taskService;


    @PostMapping("/addtask/{id}")
    public Task addTask(@RequestBody Task task, @PathVariable Long id) {

        return taskService.addTask(task,id);
    }
    @GetMapping("/task/{id}")
    public Task retrieveTask(@PathVariable Long id) {

        return taskService.getTask(id);
    }

    @GetMapping("/tasks")

    public List<Task> retrieveAllTasks() {

        return taskService.getAllTasks();
    }

    @DeleteMapping("/task/{id}")
    public void deleteTask(@PathVariable long id) {

        taskService.deleteTask(id);
    }

    @PutMapping("/task")
    public Task updateTask(@RequestBody Task task) {

        return taskService.updateTask(task);
    }

}
