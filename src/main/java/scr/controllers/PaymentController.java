package scr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scr.entities.Payment;
import scr.exceptions.ClientNotFound;
import scr.exceptions.CreditNotFound;
import scr.pojo.PaymentRequest;
import scr.service.PaymentService;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/getAll")
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/get")
    public Payment getPaymentById(@RequestParam("id") Long id) {
        return paymentService.getPaymentById(id);
    }

    @PostMapping("/create")
    public String createPayment(@RequestBody PaymentRequest paymentRequest) {
        try {
            paymentService.addPayment(paymentRequest);
            return "Payment with " + paymentRequest.getPaymentId() + " has been saved";
        } catch (ClientNotFound e) {
            return "Client with this id was not found";
        } catch (CreditNotFound e) {
            return "Credit with this id was not found";
        }

    }

    @DeleteMapping("/delete")
    public void deletePaymentById(Long id) {
        paymentService.deletePaymentById(id);
    }

}
