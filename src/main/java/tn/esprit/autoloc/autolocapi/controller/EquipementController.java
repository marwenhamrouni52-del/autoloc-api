
package tn.esprit.autoloc.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.autolocapi.domain.equipement;
import tn.esprit.autoloc.autolocapi.service.IEquipementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Equipement")
public class EquipementController {

    private final IEquipementService equipementService;

    // Ajouter un équipement
    @PostMapping("/addEquipement")
    public equipement addEquipement(@RequestBody equipement e) {
        return equipementService.addEquipement(e);
    }

    // Afficher tous les équipements
    @GetMapping("/retrieveAllEquipements")
    public List<equipement> retrieveAllEquipements() {
        return equipementService.retrieveAllEquipements();
    }

    // Afficher un équipement par ID
    @GetMapping("/retrieveEquipement/{idEquipement}")
    public equipement retrieveEquipement(
            @PathVariable Long idEquipement) {
        return equipementService.retrieveEquipement(idEquipement);
    }

    // Modifier un équipement
    @PutMapping("/updateEquipement")
    public equipement updateEquipement(@RequestBody equipement e) {
        return equipementService.updateEquipement(e);
    }

    // Supprimer un équipement
    @DeleteMapping("/deleteEquipement/{idEquipement}")
    public void deleteEquipement(@PathVariable Long idEquipement) {
        equipementService.removeEquipement(idEquipement);
    }

    // Ajouter plusieurs équipements
    @PostMapping("/addEquipements")
    public List<equipement> addEquipements(
            @RequestBody List<equipement> equipements) {
        return equipementService.addEquipements(equipements);
    }
}
