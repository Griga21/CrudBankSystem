package bankSystem.services.impl;

import bankSystem.DTO.CreditDto;
import bankSystem.exceptions.ResourceNotFound;
import bankSystem.mapper.CreditMapper;
import bankSystem.models.Credit;
import bankSystem.repositories.CreditRepository;
import bankSystem.services.CreditService;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class CreditServiceImpl implements CreditService {
    private CreditRepository creditRepository;

    @Override
    public CreditDto createCredit(CreditDto creditDto) {
        Credit credit = CreditMapper.mapToCredit(creditDto);
        Credit savedCredit = creditRepository.save(credit);
        return CreditMapper.mapToCreditDto(savedCredit);
    }

    @Override
    public CreditDto getCreditById(Long creditId) {
        Credit credit = creditRepository.findById(creditId).orElseThrow(
                () -> new ResourceNotFound("Client is not exists with a given id: " + creditId)
        );
        return CreditMapper.mapToCreditDto(credit);
    }

    @Override
    public List<CreditDto> getAllCredit() {
        List<Credit> credits = creditRepository.findAll();
        return credits.stream().map(credit -> CreditMapper.mapToCreditDto(credit)).collect(Collectors.toList());
    }

    @Override
    public CreditDto updateCredit(Long creditId, CreditDto updateCreditDto) {
        Credit credit = creditRepository.findById(creditId).orElseThrow(
                () -> new ResourceNotFound("Client is not exists with a given id: " + creditId)
        );
        return CreditMapper.mapToCreditDto(credit);
    }

    @Override
    public void deleteCredit(Long creditId) {
        creditRepository.findById(creditId).orElseThrow(
                () -> new ResourceNotFound("Client is not exists with a given id: " + creditId)
        );
        creditRepository.deleteById(creditId);
    }
}
