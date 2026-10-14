package tn.esprit.autoloc.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.equipement;
import tn.esprit.autoloc.autolocapi.repository.EquipementRepository;

import java.util.List;

@Service
public class EquipementService implements IEquipementService {

    private final EquipementRepository equipementRepo;

    public EquipementService(EquipementRepository equipementRepo) {
        this.equipementRepo = equipementRepo;
    }

    @Override
    public List<equipement> retrieveAllEquipements() {
        return (List<equipement>) equipementRepo.findAll();
    }

    @Override
    public equipement addEquipement(equipement e) {
        return equipementRepo.save(e);
    }

    @Override
    public equipement updateEquipement(equipement e) {
        return equipementRepo.save(e);
    }

    @Override
    public equipement retrieveEquipement(Long idEquipement) {
        return equipementRepo.findById(idEquipement).orElse(null);
    }

    @Override
    public void removeEquipement(Long idEquipement) {
        equipementRepo.deleteById(idEquipement);
    }

    @Override
    public List<equipement> addEquipements(List<equipement> equipements) {
        return (List<equipement>) equipementRepo.saveAll(equipements);
    }
}