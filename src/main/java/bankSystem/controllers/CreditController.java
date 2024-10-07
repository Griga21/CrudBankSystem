package bankSystem.controllers;

import bankSystem.DTO.CreditDto;
import bankSystem.services.impl.CreditServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credit")
@RequiredArgsConstructor
public class CreditController {
    private final CreditServiceImpl creditService;


    @PostMapping("/create")
    public ResponseEntity<CreditDto> createCredit(@RequestBody CreditDto creditDto) {
        CreditDto credit = creditService.createCredit(creditDto);
        return new ResponseEntity<CreditDto>(credit, HttpStatus.CREATED);
    }

    @GetMapping("/get{id}")
    public ResponseEntity<CreditDto> getCreditById(@RequestParam("id") Long id) {
        CreditDto creditDto = creditService.getCreditById(id);
        return ResponseEntity.ok(creditDto);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<CreditDto>> getAllCredits() {
        List<CreditDto> creditDtos = creditService.getAllCredit();
        return ResponseEntity.ok(creditDtos);
    }

    @DeleteMapping("/delete{id}")
    public void deleteCredit(@RequestParam(name = "id") Long id) {
        creditService.deleteCredit(id)  ;
    }
}
