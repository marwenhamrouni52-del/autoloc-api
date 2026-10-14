package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.employe;
import java.util.List;

public interface IEmployeService {

    List<employe> retrieveAllEmployes();

    employe addEmploye(employe e);

    employe updateEmploye(employe e);

    employe retrieveEmploye(Long idEmploye);

    void removeEmploye(Long idEmploye);

    List<employe> addEmployes(List<employe> employes);
}