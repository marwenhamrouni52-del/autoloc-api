package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.reservation;
import java.util.List;

public interface IReservationService {

    reservation ajouterReservation(reservation r);

    List<reservation> getAllReservations();

    reservation getReservationById(Long id);

    reservation modifierReservation(reservation r);

    void supprimerReservation(Long id);
}