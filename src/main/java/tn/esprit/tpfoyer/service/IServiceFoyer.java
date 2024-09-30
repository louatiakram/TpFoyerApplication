package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

public interface IServiceFoyer {
    // Create a new Foyer
    Foyer addFoyer(Foyer foyer);

    // Retrieve a Foyer by ID
    Foyer getFoyerById(Long id);

    // Retrieve all Foyers
    List<Foyer> getAllFoyers();

    // Update an existing Foyer
    Foyer updateFoyer(Foyer foyer);

    // Delete a Foyer by ID
    void deleteFoyer(Long id);
}
