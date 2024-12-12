package scr.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class PaymentRequest {
    private Long paymentId;
    private Timestamp payData;
    private Double amountPayment;
    private String currency;
    private Long client_id;
    private Long credit_id;
}
