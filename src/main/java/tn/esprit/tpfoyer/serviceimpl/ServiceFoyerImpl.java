package tn.esprit.tpfoyer.serviceimpl;

import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.repository.FoyerRepository;
import tn.esprit.tpfoyer.service.IServiceFoyer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceFoyerImpl implements IServiceFoyer {

    @Autowired
    private FoyerRepository foyerRepository;

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer getFoyerById(Long id) {
        Optional<Foyer> foyer = foyerRepository.findById(id);
        return foyer.orElse(null);
    }

    @Override
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        if (foyerRepository.existsById(foyer.getId())) {
            return foyerRepository.save(foyer);
        }
        return null;
    }

    @Override
    public void deleteFoyer(Long id) {
        if (foyerRepository.existsById(id)) {
            foyerRepository.deleteById(id);
        }
    }
}
