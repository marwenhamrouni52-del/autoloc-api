package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapi.domain.maintenance;

public interface MaintenanceRepository
        extends JpaRepository<maintenance, Long> {
}