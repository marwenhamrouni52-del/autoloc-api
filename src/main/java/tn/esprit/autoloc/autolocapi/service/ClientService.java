package tn.esprit.autoloc.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Client;
import tn.esprit.autoloc.autolocapi.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService implements IclientService {

    private final ClientRepository clRepo;

    public ClientService(ClientRepository clRepo) {
        this.clRepo = clRepo;
    }

    @Override
    public List<Client> retrieveAllClients() {
        return (List<Client>) clRepo.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clRepo.save(c);
    }

    @Override
    public Client updateClient(Client c) {
        return clRepo.save(c);
    }

    @Override
    public Client retrieveClient(Long idClient) {
        return clRepo.findById(idClient).orElse(null);
    }

    @Override
    public void removeClient(Long idClient) {
        clRepo.deleteById(idClient);
    }

    @Override
    public List<Client> addClients(List<Client> clients) {
        return (List<Client>) clRepo.saveAll(clients);
    }
}