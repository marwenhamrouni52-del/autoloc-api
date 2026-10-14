
package tn.esprit.autoloc.autolocapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.autolocapi.domain.Vehicule;
import tn.esprit.autoloc.autolocapi.service.IVehiculeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Vehicule")
@Tag(name = "Gestion des véhicules",
        description = "API de gestion des véhicules")
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @Operation(
            summary = "Ajouter un véhicule",
            description = "Permet d'enregistrer un nouveau véhicule"
    )
    @ApiResponse(responseCode = "200",
            description = "Véhicule enregistré avec succès")
    @ApiResponse(responseCode = "400",
            description = "Données invalides")
    @PostMapping("/addVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule v) {
        return vehiculeService.ajouterVehicule(v);
    }

    @Operation(summary = "Afficher tous les véhicules")
    @ApiResponse(responseCode = "200",
            description = "Liste des véhicules récupérée")
    @GetMapping("/retrieveAllVehicules")
    public List<Vehicule> retrieveAllVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @Operation(summary = "Rechercher un véhicule par ID")
    @ApiResponse(responseCode = "200",
            description = "Recherche exécutée")
    @GetMapping("/retrieveVehicule/{id}")
    public Vehicule retrieveVehicule(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @Operation(summary = "Modifier un véhicule")
    @ApiResponse(responseCode = "200",
            description = "Enregistrement effectué")
    @PutMapping("/updateVehicule")
    public Vehicule updateVehicule(@RequestBody Vehicule v) {
        return vehiculeService.modifierVehicule(v);
    }

    @Operation(summary = "Supprimer un véhicule")
    @ApiResponse(responseCode = "200",
            description = "Suppression effectuée")
    @DeleteMapping("/deleteVehicule/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.supprimerVehicule(id);
    }
}
