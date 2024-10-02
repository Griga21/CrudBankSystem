package bankSystem.services;

import bankSystem.DTO.ClientDto;

import java.util.List;

public interface ClientService {
    ClientDto createClient(ClientDto clientDto);

    ClientDto getClientById(Long idClient);

    List<ClientDto> getAllClient();

    ClientDto updateClient(Long idClient, ClientDto updateClientDto);

    void deleteClient(Long idClient);
}
