package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Vehicule;
import java.util.List;

public interface IVehiculeService {

    Vehicule ajouterVehicule(Vehicule v);

    List<Vehicule> getAllVehicules();

    Vehicule getVehiculeById(Long id);

    Vehicule modifierVehicule(Vehicule v);

    void supprimerVehicule(Long id);
}