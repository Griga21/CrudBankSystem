package bankSystem.DTO;

import bankSystem.models.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditDto {
    private Long creditId;
    private Client client;
    private double total;
    private double bet;
    private double remains;
    private Date startData;
    private Date endData;
}
