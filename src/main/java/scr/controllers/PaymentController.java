package scr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scr.entities.Payment;
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

    @DeleteMapping("/delete")
    public void deletePaymentById(Long id) {
        paymentService.deletePaymentById(id);
    }
}
