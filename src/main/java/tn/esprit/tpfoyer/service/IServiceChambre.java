package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Chambre;

import java.util.List;

public interface IServiceChambre {
    // Create a new Chambre
    Chambre addChambre(Chambre chambre);

    // Retrieve a Chambre by ID
    Chambre getChambreById(Long id);

    // Retrieve all Chambres
    List<Chambre> getAllChambres();

    // Update an existing Chambre
    Chambre updateChambre(Chambre chambre);

    // Delete a Chambre by ID
    void deleteChambre(Long id);
}
