package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.paiement;
import java.util.List;

public interface IPaiementService {

    paiement ajouterPaiement(paiement p);

    List<paiement> getAllPaiements();

    paiement getPaiementById(Long id);

    paiement modifierPaiement(paiement p);

    void supprimerPaiement(Long id);
}