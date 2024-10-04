package bankSystem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "credits")
@AllArgsConstructor
@NoArgsConstructor
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long creditId;
    @Column(name = "client_id")
    private Long clientId;
    @Column(name = "total")
    private double total;
    @Column(name = "bet")
    private double bet;
}
