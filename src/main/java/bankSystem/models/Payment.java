package bankSystem.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPayment;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @Column(name = "client_id")
    private Long clientId;
    @Column(name = "credit_id")
    private Long creditId;
    @Column(name = "amount")
    private double amount;
    @Column(name = "data")
    private Date date;
}
