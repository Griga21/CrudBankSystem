package bankSystem.services;

import bankSystem.DTO.CreditDto;

import java.util.List;

public interface CreditService {
    CreditDto createCredit(CreditDto creditDto);

    CreditDto getCreditById(Long creditId);

    List<CreditDto> getAllCredit();

    CreditDto updateCredit(Long creditId, CreditDto updateCreditDto);

    void deleteCredit(Long creditId);
}
