package tn.esprit.tpfoyer.serviceimpl;

import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.service.IServiceBloc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceBlocImpl implements IServiceBloc {

    @Autowired
    private BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc getBlocById(Long id) {
        Optional<Bloc> bloc = blocRepository.findById(id);
        return bloc.orElse(null); // Return null if not found
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        if (blocRepository.existsById(bloc.getIdBlock())) {
            return blocRepository.save(bloc); // Update if exists
        }
        return null; // Or throw exception if Bloc doesn't exist
    }

    @Override
    public void deleteBloc(Long id) {
        if (blocRepository.existsById(id)) {
            blocRepository.deleteById(id);
        } else {
            // Handle case when Bloc doesn't exist (throw exception or log)
        }
    }
}
