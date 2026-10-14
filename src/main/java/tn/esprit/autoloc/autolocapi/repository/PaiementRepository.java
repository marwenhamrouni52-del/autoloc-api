package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapi.domain.paiement;

public interface PaiementRepository extends JpaRepository<paiement, Long> {
}