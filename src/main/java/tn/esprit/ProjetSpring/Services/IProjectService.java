package tn.esprit.ProjetSpring.Services;

import tn.esprit.ProjetSpring.entities.Project;

import java.util.List;

public interface IProjectService {
    Project addProject(Project project);
    Project getProject(long id);
    List<Project> getAllProjects();
    void deleteProject(long idProject);
    Project updateProject(Project Project);
}
