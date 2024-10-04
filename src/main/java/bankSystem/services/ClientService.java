package bankSystem.services;

import bankSystem.DTO.ClientDto;

import java.util.List;

public interface ClientService {
    ClientDto createClient(ClientDto clientDto);

    ClientDto getClientById(Long clientId);

    List<ClientDto> getAllClient();

    ClientDto updateClient(Long clientId, ClientDto updateClientDto);

    void deleteClient(Long clientId);
}
