package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Universite;

import java.util.List;

public interface IServiceUniversite {
    Universite addUniversite(Universite universite);

    Universite getUniversiteById(Long id);

    List<Universite> getAllUniversites();

    Universite updateUniversite(Universite universite);

    void deleteUniversite(Long id);
}
