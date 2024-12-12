package scr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scr.entities.Payment;

@Repository
public interface PaymentRepositories extends JpaRepository<Payment, Long> {
}
