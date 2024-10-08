package bankSystem.mapper;

import bankSystem.DTO.CreditDto;
import bankSystem.models.Credit;

public class CreditMapper {
    public static CreditDto mapToCreditDto(Credit credit) {
        return new CreditDto(credit.getCreditId(), credit.getClient(), credit.getTotal(), credit.getBet(), credit.getRemains(), credit.getStartData(), credit.getEndData());
    }

    public static Credit mapToCredit(CreditDto creditDto) {
        return new Credit(creditDto.getCreditId(), creditDto.getClient(), creditDto.getTotal(), creditDto.getBet(), creditDto.getRemains(), creditDto.getStartData(), creditDto.getEndData());
    }
}
