package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.contrat;
import java.util.List;

public interface IContratService {

    List<contrat> retrieveAllContrats();

    contrat addContrat(contrat c);

    contrat updateContrat(contrat c);

    contrat retrieveContrat(Long idContrat);

    void removeContrat(Long idContrat);

    List<contrat> addContrats(List<contrat> contrats);
}