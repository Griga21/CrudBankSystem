package bankSystem.mapper;

import bankSystem.DTO.ClientDto;
import bankSystem.models.Client;

public class ClientMapper {
    public static ClientDto mapToClientDto(Client client) {
        return new ClientDto(client.getId(), client.getName(), client.getCredits());
    }

    public static Client mapToClient(ClientDto clientDto) {
        return new Client(clientDto.getId(), clientDto.getName(), clientDto.getCredits());
    }
}
