package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapi.domain.reservation;

public interface ReservationRepository
        extends JpaRepository<reservation, Long> {
}