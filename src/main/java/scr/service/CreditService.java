package scr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scr.entities.Credit;
import scr.repositories.CreditRepositories;

import java.util.List;

@Service
public class CreditService {
    private final CreditRepositories creditRepositories;

    @Autowired
    public CreditService(CreditRepositories creditRepositories) {
        this.creditRepositories = creditRepositories;
    }

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
