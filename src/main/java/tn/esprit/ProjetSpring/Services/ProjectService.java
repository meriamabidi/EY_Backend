package tn.esprit.ProjetSpring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ProjetSpring.Repositories.ProjectRepository;
import tn.esprit.ProjetSpring.entities.Project;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectService implements IProjectService{
    ProjectRepository projectRepository;

    @Override
    public Project addProject(Project project) {
        return projectRepository.save(project);

    }

    @Override
    public Project getProject(long id) {
        return projectRepository.findById(id).orElse(null);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public void deleteProject(long idProject) {
        projectRepository.deleteById(idProject);

    }

    @Override
    public Project updateProject(Project project) {
        Project ch=projectRepository.findById(project.getProjectId()).orElse(null);
        if (ch!=null)
            projectRepository.save(project);
        return  ch;    }
}
