package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.autolocapi.domain.employe;

public interface EmployeRepository extends CrudRepository<employe, Long> {
}