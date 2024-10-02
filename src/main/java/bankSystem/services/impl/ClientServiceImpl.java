package bankSystem.services.impl;

import bankSystem.DTO.ClientDto;
import bankSystem.exceptions.ResourceNotFound;
import bankSystem.mapper.ClientMapper;
import bankSystem.models.Client;
import bankSystem.repositories.ClientRepository;
import bankSystem.services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
    private ClientRepository clientRepository;

    @Override
    public ClientDto createClient(ClientDto clientDto) {
        Client client = ClientMapper.mapToClient(clientDto);
        Client savedClient = clientRepository.save(client);
        return ClientMapper.mapToClientDto(savedClient);
    }

    @Override
    public ClientDto getClientById(Long idClient) {
        Client client = clientRepository.findById(idClient).orElseThrow(
                () -> new ResourceNotFound("Client is not exists with a given id: " + idClient)
        );
        return ClientMapper.mapToClientDto(client);
    }

    @Override
    public List<ClientDto> getAllClient() {
        List<Client> clients = clientRepository.findAll();
        return clients.stream().map(client -> ClientMapper.mapToClientDto(client)).collect(Collectors.toList());
    }

    @Override
    public ClientDto updateClient(Long idClient, ClientDto updateClientDto) {
        Client client = clientRepository.findById(idClient).orElseThrow(
                () -> new ResourceNotFound("Client is not exists with a given id: " + idClient)
        );
        client.setName(updateClientDto.getName());
        Client savedClient = clientRepository.save(client);
        return ClientMapper.mapToClientDto(savedClient);
    }

    @Override
    public void deleteClient(Long idClient) {
        clientRepository.findById(idClient).orElseThrow(
                () -> new ResourceNotFound("Client is not exists with a given id: " + idClient)
        );
        clientRepository.deleteById(idClient);
    }
}
