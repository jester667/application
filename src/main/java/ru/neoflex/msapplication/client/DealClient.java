package ru.neoflex.msapplication.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.neoflex.msapplication.model.LoanApplicationRequestDTO;
import ru.neoflex.msapplication.model.LoanOfferDTO;

import java.util.List;

@FeignClient(url = "${client.deal.endpoint}", name = "DEAL-FEIGN-CLIENT")
public interface DealClient {

    @PostMapping("/application")
    ResponseEntity<List<LoanOfferDTO>> createApplication(@RequestBody LoanApplicationRequestDTO request);

    @PutMapping("/offer")
    ResponseEntity<Void> applyOffer(@RequestBody LoanOfferDTO request);
}
