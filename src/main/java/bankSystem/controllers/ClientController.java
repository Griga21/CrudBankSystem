package bankSystem.controllers;

import bankSystem.DTO.ClientDto;
import bankSystem.services.impl.ClientServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    private final ClientServiceImpl clientService;

    @PostMapping("/create")
    public ResponseEntity<ClientDto> createClient(@RequestBody ClientDto clientDto) {
        ClientDto client = clientService.createClient(clientDto);
        return new ResponseEntity<>(client, HttpStatus.CREATED);
    }

    @GetMapping("/get{id}")
    public ResponseEntity<ClientDto> getClientById(@RequestParam(name = "id") Long id) {
        ClientDto clientDto = clientService.getClientById(id);
        return ResponseEntity.ok(clientDto);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<ClientDto>> getAllClients() {
        List<ClientDto> clients = clientService.getAllClient();
        return ResponseEntity.ok(clients);
    }
}
