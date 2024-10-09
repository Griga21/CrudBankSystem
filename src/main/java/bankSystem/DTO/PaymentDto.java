package bankSystem.DTO;

import bankSystem.models.Client;
import bankSystem.models.Credit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
    private Long idPayment;
    private Client client;
    private Credit credit;
    private double amount;
    private Date date;
}
