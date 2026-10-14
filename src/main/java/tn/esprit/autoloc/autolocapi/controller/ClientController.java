
package tn.esprit.autoloc.autolocapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.autolocapi.domain.Client;
import tn.esprit.autoloc.autolocapi.service.IclientService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Client")
@Tag(name = "Gestion des clients",
        description = "API de gestion des clients")
public class ClientController {

    private final IclientService iclientService;

    // Ajouter un client
    @Operation(
            summary = "Ajouter un client",
            description = "Permet d'enregistrer un nouveau client"
    )
    @ApiResponse(responseCode = "200",
            description = "Client ajouté avec succès")
    @ApiResponse(responseCode = "400",
            description = "Données invalides")
    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        return iclientService.addClient(client);
    }

    // Afficher tous les clients
    @Operation(summary = "Afficher tous les clients")
    @ApiResponse(responseCode = "200",
            description = "Liste des clients récupérée")
    @GetMapping("/retrieveAllClients")
    public List<Client> retrieveAllClients() {
        return iclientService.retrieveAllClients();
    }

    // Afficher un client par ID
    @Operation(summary = "Rechercher un client par ID")
    @ApiResponse(responseCode = "200",
            description = "Recherche du client exécutée")
    @GetMapping("/retrieveClient/{idClient}")
    public Client retrieveClient(@PathVariable Long idClient) {
        return iclientService.retrieveClient(idClient);
    }

    // Modifier un client
    @Operation(
            summary = "Modifier un client",
            description = "Permet de modifier les informations d'un client"
    )
    @ApiResponse(responseCode = "200",
            description = "Enregistrement effectué")
    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client client) {
        return iclientService.updateClient(client);
    }

    // Supprimer un client
    @Operation(summary = "Supprimer un client")
    @ApiResponse(responseCode = "200",
            description = "Client supprimé avec succès")
    @DeleteMapping("/deleteClient/{idClient}")
    public void deleteClient(@PathVariable Long idClient) {
        iclientService.removeClient(idClient);
    }
}
