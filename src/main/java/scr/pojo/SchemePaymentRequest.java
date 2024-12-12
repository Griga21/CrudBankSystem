package scr.pojo;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Map;

@Data
public class SchemePaymentRequest {

    private Long schemeId;
    private Long creditId;
    private Map<Timestamp, Double> payments;
}
