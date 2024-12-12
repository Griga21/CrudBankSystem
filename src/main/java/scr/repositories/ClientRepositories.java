package scr.repositories;

import scr.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositories extends JpaRepository<Client, Long> {
}
