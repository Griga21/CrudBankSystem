package scr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scr.entities.Client;
import scr.repositories.ClientRepositories;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepositories clientRepositories;

    @Autowired
    public ClientService(ClientRepositories clientRepositories) {
        this.clientRepositories = clientRepositories;
    }

    public void addClient(Client client) {
        clientRepositories.save(client);
    }

    public Client getClientById(Long id) {
        return clientRepositories.findById(id).get();
    }

    public List<Client> getAllClients() {
        return clientRepositories.findAll();
    }

    public void deleteClient(Long id) {
        clientRepositories.deleteById(id);
    }
}
