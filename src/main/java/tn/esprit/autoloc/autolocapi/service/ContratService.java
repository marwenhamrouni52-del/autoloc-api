package tn.esprit.autoloc.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.contrat;
import tn.esprit.autoloc.autolocapi.repository.ContratRepository;

import java.util.List;

@Service
public class ContratService implements IContratService {

    private final ContratRepository contratRepo;

    public ContratService(ContratRepository contratRepo) {
        this.contratRepo = contratRepo;
    }

    @Override
    public List<contrat> retrieveAllContrats() {
        return (List<contrat>) contratRepo.findAll();
    }

    @Override
    public contrat addContrat(contrat c) {
        return contratRepo.save(c);
    }

    @Override
    public contrat updateContrat(contrat c) {
        return contratRepo.save(c);
    }

    @Override
    public contrat retrieveContrat(Long idContrat) {
        return contratRepo.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Long idContrat) {
        contratRepo.deleteById(idContrat);
    }

    @Override
    public List<contrat> addContrats(List<contrat> contrats) {
        return (List<contrat>) contratRepo.saveAll(contrats);
    }
}