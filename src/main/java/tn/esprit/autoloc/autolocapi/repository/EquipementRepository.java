package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.autolocapi.domain.equipement;

public interface EquipementRepository extends CrudRepository<equipement, Long> {
}