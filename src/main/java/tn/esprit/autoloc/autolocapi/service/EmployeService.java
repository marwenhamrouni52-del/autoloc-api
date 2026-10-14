package tn.esprit.autoloc.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.employe;
import tn.esprit.autoloc.autolocapi.repository.EmployeRepository;

import java.util.List;

@Service
public class EmployeService implements IEmployeService {

    private final EmployeRepository employeRepo;

    public EmployeService(EmployeRepository employeRepo) {
        this.employeRepo = employeRepo;
    }

    @Override
    public List<employe> retrieveAllEmployes() {
        return (List<employe>) employeRepo.findAll();
    }

    @Override
    public employe addEmploye(employe e) {
        return employeRepo.save(e);
    }

    @Override
    public employe updateEmploye(employe e) {
        return employeRepo.save(e);
    }

    @Override
    public employe retrieveEmploye(Long idEmploye) {
        return employeRepo.findById(idEmploye).orElse(null);
    }

    @Override
    public void removeEmploye(Long idEmploye) {
        employeRepo.deleteById(idEmploye);
    }

    @Override
    public List<employe> addEmployes(List<employe> employes) {
        return (List<employe>) employeRepo.saveAll(employes);
    }
}