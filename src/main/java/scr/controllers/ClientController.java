package scr.controllers;

import scr.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scr.service.ClientService;

import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/create")
    public Client createClient(@RequestBody Client client) {
        clientService.addClient(client);
        return client;
    }

    @GetMapping("/get")
    public Client getClientById(@RequestParam("id") Long id) {
        return clientService.getClientById(id);
    }

    @GetMapping("/getAll")
    public List<Client> getAllClient() {
        return clientService.getAllClients();
    }

    @DeleteMapping("/delete")
    public void deleteClientById(@RequestParam("id") Long id) {
        clientService.deleteClient(id);
    }
}
