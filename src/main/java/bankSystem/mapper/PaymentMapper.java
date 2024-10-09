package bankSystem.mapper;

import bankSystem.DTO.PaymentDto;
import bankSystem.models.Payment;

public class PaymentMapper {
    public static PaymentDto mapToPaymentDto(Payment payment) {
        return new PaymentDto(payment.getIdPayment(), payment.getClient(), payment.getCredit(), payment.getAmount(), payment.getDate());
    }

    public static Payment mapToPayment(PaymentDto paymentDto) {
        return new Payment(paymentDto.getIdPayment(), paymentDto.getClient(), paymentDto.getCredit(), paymentDto.getAmount(), paymentDto.getDate());
    }
}
