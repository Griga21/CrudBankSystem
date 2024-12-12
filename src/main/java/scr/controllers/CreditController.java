package scr.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import scr.entities.Credit;
import scr.service.CreditService;

import java.util.List;

@RestController
@RequestMapping(value = "/credits")
@AllArgsConstructor
public class CreditController {
    private final CreditService creditService;

    @GetMapping("/get")
    public Credit getCreditById(Long id) {
        return creditService.getCreditById(id);
    }

    @GetMapping("/getAll")
    public List<Credit> getAllCredits() {
        return creditService.getAllCredits();
    }

    @PostMapping("/create")
    public void createCredit(@RequestBody Credit credit) {
        creditService.addCredit(credit);
    }

    @DeleteMapping("/delete")
    public void deleteById(Long id) {
        creditService.deleteCreditById(id);
    }
}
