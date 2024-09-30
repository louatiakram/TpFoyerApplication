package tn.esprit.tpfoyer.Service;

import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

public interface IserviceFoyer {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer(Foyer f);
    Foyer updateFoyer(Foyer f);
    Foyer deleteFoyer(Foyer f);

}
