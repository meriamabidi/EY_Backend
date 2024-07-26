package tn.esprit.ProjetSpring.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ProjetSpring.Services.IProjectService;
import tn.esprit.ProjetSpring.entities.Project;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProjectController {

    IProjectService projectService;


    @PostMapping("/addproject")
    public Project addProject(@RequestBody Project project) {

        return projectService.addProject(project);
    }
    @GetMapping("/project/{id}")
    public Project retrieveProject( @PathVariable Long id) {

        return projectService.getProject(id);
    }

    @GetMapping("/projects")

    public List<Project> retrieveAllProjects() {

        return projectService.getAllProjects();
    }

    @DeleteMapping("/project/{id}")
    public void deleteProject(@PathVariable long id) {

        projectService.deleteProject(id);
    }

    @PutMapping("/project")
    public Project updateProject(@RequestBody Project project) {

        return projectService.updateProject(project);
    }
}
