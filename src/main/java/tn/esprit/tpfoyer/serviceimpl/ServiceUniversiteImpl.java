package tn.esprit.tpfoyer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.repository.UniversiteRepository;
import tn.esprit.tpfoyer.service.IServiceUniversite;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceUniversiteImpl implements IServiceUniversite {

    @Autowired
    private UniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite getUniversiteById(Long id) {
        Optional<Universite> universite = universiteRepository.findById(id);
        return universite.orElse(null);
    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        if (universiteRepository.existsById(universite.getIdUniversite())) {
            return universiteRepository.save(universite);
        }
        return null;
    }

    @Override
    public void deleteUniversite(Long id) {
        if (universiteRepository.existsById(id)) {
            universiteRepository.deleteById(id);
        }
    }
}
