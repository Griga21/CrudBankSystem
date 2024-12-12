package scr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scr.models.Credit;

@Repository
public interface CreditRepositories extends JpaRepository<Credit, Long> {
}
