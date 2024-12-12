package scr.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import scr.models.Client;
import scr.repositories.ClientRepositories;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {
    private final ClientRepositories clientRepositories;


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
