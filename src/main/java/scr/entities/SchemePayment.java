package scr.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Map;

@Entity
@Table(name = "scheme_payment")
@Data
public class SchemePayment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "scheme_id")
    private Long schemeId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "credit_id")
    private Credit credit;
    private Map<Timestamp, Double> payments;
}
