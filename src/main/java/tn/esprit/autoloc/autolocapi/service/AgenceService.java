package tn.esprit.autoloc.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.agence;
import tn.esprit.autoloc.autolocapi.repository.AgenceRepository;

import java.util.List;

@Service
public class AgenceService implements IAgenceService {

    private final AgenceRepository agenceRepo;

    public AgenceService(AgenceRepository agenceRepo) {
        this.agenceRepo = agenceRepo;
    }

    @Override
    public List<agence> retrieveAllAgences() {
        return (List<agence>) agenceRepo.findAll();
    }

    @Override
    public agence addAgence(agence a) {
        return agenceRepo.save(a);
    }

    @Override
    public agence updateAgence(agence a) {
        return agenceRepo.save(a);
    }

    @Override
    public agence retrieveAgence(Long idAgence) {
        return agenceRepo.findById(idAgence).orElse(null);
    }

    @Override
    public void removeAgence(Long idAgence) {
        agenceRepo.deleteById(idAgence);
    }

    @Override
    public List<agence> addAgences(List<agence> agences) {
        return (List<agence>) agenceRepo.saveAll(agences);
    }
}