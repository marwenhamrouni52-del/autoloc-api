
package tn.esprit.autoloc.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.autolocapi.domain.contrat;
import tn.esprit.autoloc.autolocapi.service.IContratService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Contrat")
public class ContratController {

    private final IContratService contratService;

    // Ajouter un contrat
    @PostMapping("/addContrat")
    public contrat addContrat(@RequestBody contrat c) {
        return contratService.addContrat(c);
    }
    // Afficher tous les contrats
    @GetMapping("/retrieveAllContrats")
    public List<contrat> retrieveAllContrats(){
        return contratService.retrieveAllContrats();
    }
    // Afficher un contrat par ID
    @GetMapping("/retrieveContrat/{idContrat}")
    public contrat retrieveContrat(@PathVariable Long idContrat) {
        return contratService.retrieveContrat(idContrat);
    }
    // Modifier un contrat
    @PutMapping("/updateContrat")
    public contrat updateContrat(@RequestBody contrat c) {
        return contratService.updateContrat(c);
    }
    // Supprimer un contrat
    @DeleteMapping("/deleteContrat/{idContrat}")
    public void deleteContrat(@PathVariable Long idContrat) {
        contratService.removeContrat(idContrat);
    }
    // Ajouter plusieurs contrats
    @PostMapping("/addContrats")
    public List<contrat> addContrats(@RequestBody List<contrat> contrats) {
        return contratService.addContrats(contrats);
    }

}
