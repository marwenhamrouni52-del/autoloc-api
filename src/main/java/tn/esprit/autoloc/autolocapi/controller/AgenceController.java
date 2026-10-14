
package tn.esprit.autoloc.autolocapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.autolocapi.domain.agence;
import tn.esprit.autoloc.autolocapi.service.IAgenceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Agence")
@Tag(name = "Gestion des agences",
        description = "API de gestion des agences de location")
public class AgenceController {

    private final IAgenceService agenceService;

    // Ajouter une agence
    @Operation(
            summary = "Ajouter une agence",
            description = "Permet d'enregistrer une nouvelle agence"
    )
    @ApiResponse(responseCode = "200",
            description = "Agence ajoutée avec succès")
    @ApiResponse(responseCode = "400",
            description = "Données invalides")
    @PostMapping("/addAgence")
    public agence addAgence(@RequestBody agence a) {
        return agenceService.addAgence(a);
    }

    // Afficher toutes les agences
    @Operation(summary = "Afficher toutes les agences")
    @ApiResponse(responseCode = "200",
            description = "Liste des agences récupérée")
    @GetMapping("/retrieveAllAgences")
    public List<agence> retrieveAllAgences() {
        return agenceService.retrieveAllAgences();
    }

    // Afficher une agence par ID
    @Operation(summary = "Rechercher une agence par ID")
    @ApiResponse(responseCode = "200",
            description = "Recherche de l'agence exécutée")
    @GetMapping("/retrieveAgence/{idAgence}")
    public agence retrieveAgence(@PathVariable Long idAgence) {
        return agenceService.retrieveAgence(idAgence);
    }

    // Modifier une agence
    @Operation(
            summary = "Modifier une agence",
            description = "Permet de modifier les informations d'une agence"
    )
    @ApiResponse(responseCode = "200",
            description = "Enregistrement effectué")
    @PutMapping("/updateAgence")
    public agence updateAgence(@RequestBody agence a) {
        return agenceService.updateAgence(a);
    }

    // Supprimer une agence
    @Operation(summary = "Supprimer une agence")
    @ApiResponse(responseCode = "200",
            description = "Agence supprimée avec succès")
    @DeleteMapping("/deleteAgence/{idAgence}")
    public void deleteAgence(@PathVariable Long idAgence) {
        agenceService.removeAgence(idAgence);
    }

    // Ajouter plusieurs agences
    @Operation(
            summary = "Ajouter plusieurs agences",
            description = "Permet d'enregistrer une liste d'agences"
    )
    @ApiResponse(responseCode = "200",
            description = "Agences ajoutées avec succès")
    @ApiResponse(responseCode = "400",
            description = "Données invalides")
    @PostMapping("/addAgences")
    public List<agence> addAgences(
            @RequestBody List<agence> agences) {
        return agenceService.addAgences(agences);
    }
}
