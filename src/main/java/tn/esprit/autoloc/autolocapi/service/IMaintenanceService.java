package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.maintenance;
import java.util.List;

public interface IMaintenanceService {

    maintenance ajouterMaintenance(maintenance m);

    List<maintenance> getAllMaintenances();

    maintenance getMaintenanceById(Long id);

    maintenance modifierMaintenance(maintenance m);

    void supprimerMaintenance(Long id);
}