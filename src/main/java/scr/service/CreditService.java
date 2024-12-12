package scr.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import scr.models.Credit;
import scr.repositories.CreditRepositories;

import java.util.List;

@Service
@AllArgsConstructor
public class CreditService {
    private CreditRepositories creditRepositories;

    public void addCredit(Credit credit) {
        creditRepositories.save(credit);
    }

    public List<Credit> getAllCredits() {
        return creditRepositories.findAll();
    }

    public Credit getCreditById(Long id) {
        return creditRepositories.findById(id).get();
    }

    public void deleteCreditById(Long id) {
        creditRepositories.deleteById(id);
    }
}
