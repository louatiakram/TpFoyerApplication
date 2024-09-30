package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;

public interface IServiceEtudiant {
    // Create a new Etudiant
    Etudiant addEtudiant(Etudiant etudiant);

    // Retrieve an Etudiant by ID
    Etudiant getEtudiantById(Long id);

    // Retrieve all Etudiants
    List<Etudiant> getAllEtudiants();

    // Update an existing Etudiant
    Etudiant updateEtudiant(Etudiant etudiant);

    // Delete an Etudiant by ID
    void deleteEtudiant(Long id);
}
