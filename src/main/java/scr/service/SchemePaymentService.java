package scr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scr.entities.Credit;
import scr.entities.SchemePayment;
import scr.exceptions.CreditNotFound;
import scr.pojo.SchemePaymentRequest;
import scr.repositories.CreditRepositories;
import scr.repositories.SchemePaymentRepositories;

import java.sql.Timestamp;
import java.util.List;

@Service
public class SchemePaymentService {
    private SchemePaymentRepositories schemePaymentRepositories;
    private CreditRepositories creditRepositories;

    @Autowired
    public SchemePaymentService(SchemePaymentRepositories schemePaymentRepositories, CreditRepositories creditRepositories) {
        this.schemePaymentRepositories = schemePaymentRepositories;
        this.creditRepositories = creditRepositories;
    }

    public SchemePayment getSchemePaymentById(Long id) {
        return schemePaymentRepositories.findById(id).get();
    }

    public List<SchemePayment> getAllSchemePayment() {
        return schemePaymentRepositories.findAll();
    }

    public void deleteSchemePaymentById(Long id) {
        schemePaymentRepositories.deleteById(id);
    }

    public void addSchemePayment(SchemePaymentRequest schemePaymentRequest) throws CreditNotFound {
        Credit credit = creditRepositories.findById(schemePaymentRequest.getCreditId()).orElseThrow(CreditNotFound::new);
        SchemePayment schemePayment = new SchemePayment();
        schemePayment.setCredit(credit);
        schemePayment.setSchemeId(schemePaymentRequest.getSchemeId());
        calculateSchemePayment(schemePayment);
    }

    private void calculateSchemePayment(SchemePayment schemePayment) {
        Timestamp startData = schemePayment.getCredit().getStartData();
        Timestamp endData = schemePayment.getCredit().getEndData();
    }
}
