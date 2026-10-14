
package tn.esprit.autoloc.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.autolocapi.domain.employe;
import tn.esprit.autoloc.autolocapi.service.IEmployeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Employe")
public class EmployeController {

    private final IEmployeService employeService;

    // Ajouter un employé
    @PostMapping("/addEmploye")
    public employe addEmploye(@RequestBody employe e) {
        return employeService.addEmploye(e);
    }

    // Afficher tous les employés
    @GetMapping("/retrieveAllEmployes")
    public List<employe> retrieveAllEmployes() {
        return employeService.retrieveAllEmployes();
    }

    // Afficher un employé par ID
    @GetMapping("/retrieveEmploye/{idEmploye}")
    public employe retrieveEmploye(@PathVariable Long idEmploye) {
        return employeService.retrieveEmploye(idEmploye);
    }

    // Modifier un employé
    @PutMapping("/updateEmploye")
    public employe updateEmploye(@RequestBody employe e) {
        return employeService.updateEmploye(e);
    }

    // Supprimer un employé
    @DeleteMapping("/deleteEmploye/{idEmploye}")
    public void deleteEmploye(@PathVariable Long idEmploye) {
        employeService.removeEmploye(idEmploye);
    }

    // Ajouter plusieurs employés
    @PostMapping("/addEmployes")
    public List<employe> addEmployes(@RequestBody List<employe> employes) {
        return employeService.addEmployes(employes);
    }
}
