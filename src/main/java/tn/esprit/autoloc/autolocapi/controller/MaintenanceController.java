
package tn.esprit.autoloc.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.autolocapi.domain.maintenance;
import tn.esprit.autoloc.autolocapi.service.IMaintenanceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Maintenance")
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    // Ajouter une maintenance
    @PostMapping("/addMaintenance")
    public maintenance addMaintenance(@RequestBody maintenance m) {
        return maintenanceService.ajouterMaintenance(m);
    }

    // Afficher toutes les maintenances
    @GetMapping("/retrieveAllMaintenances")
    public List<maintenance> retrieveAllMaintenances() {
        return maintenanceService.getAllMaintenances();
    }

    // Afficher une maintenance par ID
    @GetMapping("/retrieveMaintenance/{id}")
    public maintenance retrieveMaintenance(@PathVariable Long id) {
        return maintenanceService.getMaintenanceById(id);
    }

    // Modifier une maintenance
    @PutMapping("/updateMaintenance")
    public maintenance updateMaintenance(@RequestBody maintenance m) {
        return maintenanceService.modifierMaintenance(m);
    }

    // Supprimer une maintenance
    @DeleteMapping("/deleteMaintenance/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.supprimerMaintenance(id);
    }
}
