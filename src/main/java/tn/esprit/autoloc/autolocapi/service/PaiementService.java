package tn.esprit.autoloc.autolocapi.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.autoloc.autolocapi.domain.paiement;
import tn.esprit.autoloc.autolocapi.repository.PaiementRepository;

import java.util.List;

@Service
public class PaiementService implements IPaiementService {

    @Autowired
    private PaiementRepository paiementRepository;

    @Override
    public paiement ajouterPaiement(paiement p) {
        return paiementRepository.save(p);
    }

    @Override
    public List<paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public paiement getPaiementById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    @Override
    public paiement modifierPaiement(paiement p) {
        return paiementRepository.save(p);
    }

    @Override
    public void supprimerPaiement(Long id) {
        paiementRepository.deleteById(id);
    }
}