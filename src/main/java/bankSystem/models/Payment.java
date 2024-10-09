package bankSystem.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPayment;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "credit_id", referencedColumnName = "creditId")
    private Credit credit;
    @Column(name = "amount")
    private double amount;
    @Column(name = "data")
    private Date date;
}
