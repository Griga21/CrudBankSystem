package scr.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import scr.models.Client;
import scr.service.ClientService;

import java.util.List;

@RestController
@RequestMapping(value = "/client")
@AllArgsConstructor
public class ClientController {
    private final ClientService clientService;

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
