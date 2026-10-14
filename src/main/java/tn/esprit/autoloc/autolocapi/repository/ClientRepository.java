package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.autolocapi.domain.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
}