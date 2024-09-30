package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;

public interface IServiceBloc {
    // Create a new Bloc
    Bloc addBloc(Bloc bloc);

    // Retrieve a Bloc by ID
    Bloc getBlocById(Long id);

    // Retrieve all Blocs
    List<Bloc> getAllBlocs();

    // Update an existing Bloc
    Bloc updateBloc(Bloc bloc);

    // Delete a Bloc by ID
    void deleteBloc(Long id);
}
