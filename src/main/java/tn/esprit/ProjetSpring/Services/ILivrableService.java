package tn.esprit.ProjetSpring.Services;

import tn.esprit.ProjetSpring.entities.Livrable;

import java.util.List;

public interface ILivrableService {
    Livrable addLivrable(Livrable task, long id);
    Livrable getLivrable(long id);
    List<Livrable> getAllLivrables();
    void deleteLivrable(long idLivrable);
    Livrable updateLivrable(Livrable Livrable);


    Livrable deleteDeliverable(long id);
    Livrable addDeliverable(long id, String deliverable);
}
