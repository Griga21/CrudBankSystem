package bankSystem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", referencedColumnName = "id ")
    private Client client;
    @Column(name = "total")
    private double total;
    @Column(name = "bet")
    private double bet;
    @Column(name = "remains")
    private double remains;
    @Column(name = "start_data")
    private Date startData;
    @Column(name = "end_data")
    private Date endData;
}
