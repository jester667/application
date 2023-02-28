package ru.neoflex.msapplication.controller;

import lombok.AllArgsConstructor;
import org.checkerframework.checker.index.qual.PolySameLen;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.neoflex.msapplication.model.LoanApplicationRequestDTO;
import ru.neoflex.msapplication.model.LoanOfferDTO;
import ru.neoflex.msapplication.service.ApplicationService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/application")
@AllArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping("/prescoring")
    public ResponseEntity<List<LoanOfferDTO>> preScoring(@RequestBody @Valid LoanApplicationRequestDTO req) {
        return ResponseEntity.ok(applicationService.createLoanApplication(req));
    }

    @PutMapping("/offer")
    public ResponseEntity<Void> offer(LoanOfferDTO req) {
        applicationService.applyOffer(req);
        return ResponseEntity.ok().build();
    }
}
