package scr.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "credits")
@Data
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "start_data")
    private Timestamp startData;
    @Column(name = "end_data")
    private Timestamp endData;
    @Column
    private String currency;
    @Column
    private Double bet;
    @Column
    private Double amount;
}
