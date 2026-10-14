
package tn.esprit.autoloc.autolocapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.autolocapi.domain.reservation;
import tn.esprit.autoloc.autolocapi.service.IReservationService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Reservation")
public class ReservationController {

    private final IReservationService reservationService;

    // Ajouter une réservation
    @PostMapping("/addReservation")
    public reservation addReservation(@RequestBody reservation r) {
        return reservationService.ajouterReservation(r);
    }

    // Afficher toutes les réservations
    @GetMapping("/retrieveAllReservations")
    public List<reservation> retrieveAllReservations() {
        return reservationService.getAllReservations();
    }

    // Afficher une réservation par ID
    @GetMapping("/retrieveReservation/{id}")
    public reservation retrieveReservation(@PathVariable Long id) {
        return reservationService.getReservationById(id);
    }

    // Modifier une réservation
    @PutMapping("/updateReservation")
    public reservation updateReservation(@RequestBody reservation r) {
        return reservationService.modifierReservation(r);
    }

    // Supprimer une réservation
    @DeleteMapping("/deleteReservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.supprimerReservation(id);
    }
}
