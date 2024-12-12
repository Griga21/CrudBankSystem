package scr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scr.entities.SchemePayment;

@Repository
public interface SchemePaymentRepositories extends JpaRepository<SchemePayment, Long> {
}
