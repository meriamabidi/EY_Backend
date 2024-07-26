package tn.esprit.ProjetSpring.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ProjetSpring.Services.ILivrableService;
import tn.esprit.ProjetSpring.entities.Livrable;

import java.util.List;

@RestController
@AllArgsConstructor
public class LivrableController {

ILivrableService taskService;


    @PostMapping("/addlivrable/{id}")
    public Livrable addLivrable(@RequestBody Livrable task, @PathVariable Long id) {
        return taskService.addLivrable(task,id);
    }
    @GetMapping("/livrable/{id}")
    public Livrable retrieveLivrable(@PathVariable Long id) {

        return taskService.getLivrable(id);
    }

    @GetMapping("/livrables")

    public List<Livrable> retrieveAllLivrables() {

        return taskService.getAllLivrables();
    }

    @DeleteMapping("/livrable/{id}")
    public void deleteLivrable(@PathVariable long id) {

        taskService.deleteLivrable(id);
    }

    @PutMapping("/livrable")
    public Livrable updateLivrable(@RequestBody Livrable task) {

        return taskService.updateLivrable(task);
    }
    @PutMapping("/livrableAddLink/{id}")
    public Livrable addDeliverable(@RequestBody String link, @PathVariable long id) {

        return taskService.addDeliverable(id,link);
    }
    @PutMapping("/livrableDeleteLink/{id}")
    public Livrable deleteDeliverable(@PathVariable long id) {

        return taskService.deleteDeliverable(id);
    }
    
}
