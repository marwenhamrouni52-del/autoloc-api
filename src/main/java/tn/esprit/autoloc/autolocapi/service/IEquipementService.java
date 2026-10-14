package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.equipement;
import java.util.List;

public interface IEquipementService {

    List<equipement> retrieveAllEquipements();

    equipement addEquipement(equipement e);

    equipement updateEquipement(equipement e);

    equipement retrieveEquipement(Long idEquipement);

    void removeEquipement(Long idEquipement);

    List<equipement> addEquipements(List<equipement> equipements);
}