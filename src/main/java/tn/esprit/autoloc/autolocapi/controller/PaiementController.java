
package tn.esprit.autoloc.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.autolocapi.domain.paiement;
import tn.esprit.autoloc.autolocapi.service.IPaiementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Paiement")
public class PaiementController {

    private final IPaiementService paiementService;

    // Ajouter un paiement
    @PostMapping("/addPaiement")
    public paiement addPaiement(@RequestBody paiement p) {
        return paiementService.ajouterPaiement(p);
    }

    // Afficher tous les paiements
    @GetMapping("/retrieveAllPaiements")
    public List<paiement> retrieveAllPaiements() {
        return paiementService.getAllPaiements();
    }

    // Afficher un paiement par ID
    @GetMapping("/retrievePaiement/{id}")
    public paiement retrievePaiement(@PathVariable Long id) {
        return paiementService.getPaiementById(id);
    }

    // Modifier un paiement
    @PutMapping("/updatePaiement")
    public paiement updatePaiement(@RequestBody paiement p) {
        return paiementService.modifierPaiement(p);
    }

    // Supprimer un paiement
    @DeleteMapping("/deletePaiement/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.supprimerPaiement(id);
    }
}
