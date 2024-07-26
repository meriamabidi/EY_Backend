package tn.esprit.ProjetSpring.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ProjetSpring.Services.IWorkSchedulingService;
import tn.esprit.ProjetSpring.entities.WorkScheduling;

import java.util.List;
@RestController
@AllArgsConstructor
public class WorkSchedulingController {
    IWorkSchedulingService workSchedulingService;


    @PostMapping("/addworkScheduling/{projectid}")
    public WorkScheduling addWorkScheduling(@PathVariable Long projectid,@RequestBody WorkScheduling workScheduling) {

        return workSchedulingService.addWorkScheduling(workScheduling,projectid);
    }
    @GetMapping("/workScheduling/{id}")
    public WorkScheduling retrieveWorkScheduling( @PathVariable Long id) {

        return workSchedulingService.getWorkScheduling(id);
    }

    @GetMapping("/workSchedulings")

    public List<WorkScheduling> retrieveAllWorkSchedulings() {

        return workSchedulingService.getAllWorkSchedulings();
    }

    @DeleteMapping("/workScheduling/{id}")
    public void deleteWorkScheduling(@PathVariable long id) {

        workSchedulingService.deleteWorkScheduling(id);
    }

    @PutMapping("/workScheduling")
    public WorkScheduling updateWorkScheduling(@RequestBody WorkScheduling workScheduling) {

        return workSchedulingService.updateWorkScheduling(workScheduling);
    }
}
