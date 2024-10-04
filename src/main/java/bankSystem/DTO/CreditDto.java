package bankSystem.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditDto {
    private Long creditId;
    private Long clientId;
    private double total;
    private double bet;
}
