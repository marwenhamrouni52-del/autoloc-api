package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.agence;
import java.util.List;

public interface IAgenceService {

    List<agence> retrieveAllAgences();
    agence addAgence(agence a);
    agence updateAgence(agence a);
    agence retrieveAgence(Long idAgence);
    void removeAgence(Long idAgence);
    List<agence> addAgences(List<agence> agences);
}