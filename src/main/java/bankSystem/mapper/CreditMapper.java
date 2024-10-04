package bankSystem.mapper;

import bankSystem.DTO.CreditDto;
import bankSystem.models.Credit;

public class CreditMapper {
    public static CreditDto mapToCreditDto(Credit credit) {
        return new CreditDto(credit.getCreditId(), credit.getCreditId(), credit.getTotal(), credit.getBet());
    }
    public static Credit mapToCredit(CreditDto creditDto) {
        return new Credit(creditDto.getCreditId(), creditDto.getCreditId(), creditDto.getTotal(), creditDto.getBet());
    }
}
