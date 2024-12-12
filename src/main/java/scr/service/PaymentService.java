package scr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scr.entities.Client;
import scr.entities.Credit;
import scr.entities.Payment;
import scr.exceptions.ClientNotFound;
import scr.exceptions.CreditNotFound;
import scr.pojo.PaymentRequest;
import scr.repositories.ClientRepositories;
import scr.repositories.CreditRepositories;
import scr.repositories.PaymentRepositories;

import java.util.List;

@Service
public class PaymentService {
    private PaymentRepositories paymentRepositories;
    private ClientRepositories clientRepositories;
    private CreditRepositories creditRepositories;

    @Autowired
    public PaymentService(PaymentRepositories paymentRepositories, ClientRepositories clientRepositories, CreditRepositories creditRepositories) {
        this.paymentRepositories = paymentRepositories;
        this.clientRepositories = clientRepositories;
        this.creditRepositories = creditRepositories;
    }

    public Payment getPaymentById(Long id) {
        return paymentRepositories.findById(id).get();
    }

    public List<Payment> getAllPayments() {
        return paymentRepositories.findAll();
    }

    public void deletePaymentById(Long id) {
        paymentRepositories.deleteById(id);
    }

    public void addPayment(PaymentRequest paymentRequest) throws ClientNotFound, CreditNotFound {
        Client client = clientRepositories.findById(paymentRequest.getClient_id()).orElseThrow(ClientNotFound::new);
        Credit credit = creditRepositories.findById(paymentRequest.getCredit_id()).orElseThrow(CreditNotFound::new);

        Payment payment = new Payment();
        payment.setAmountPayment(paymentRequest.getAmountPayment());
        payment.setCredit(credit);
        payment.setClient(client);
        payment.setCurrency(paymentRequest.getCurrency());
        payment.setPayData(paymentRequest.getPayData());
    }
}
