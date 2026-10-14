package tn.esprit.autoloc.autolocapi.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.autoloc.autolocapi.domain.reservation;
import tn.esprit.autoloc.autolocapi.repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationService implements IReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public reservation ajouterReservation(reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public List<reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public reservation modifierReservation(reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public void supprimerReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}