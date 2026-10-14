package tn.esprit.autoloc.autolocapi.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.autoloc.autolocapi.domain.maintenance;
import tn.esprit.autoloc.autolocapi.repository.MaintenanceRepository;

import java.util.List;

@Service
public class MaintenanceService implements IMaintenanceService {

    @Autowired
    private MaintenanceRepository maintenanceRepository;

    @Override
    public maintenance ajouterMaintenance(maintenance m) {
        return maintenanceRepository.save(m);
    }

    @Override
    public List<maintenance> getAllMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public maintenance getMaintenanceById(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    @Override
    public maintenance modifierMaintenance(maintenance m) {
        return maintenanceRepository.save(m);
    }

    @Override
    public void supprimerMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }
}