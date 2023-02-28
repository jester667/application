package ru.neoflex.msapplication.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.neoflex.msapplication.client.DealClient;
import ru.neoflex.msapplication.model.LoanApplicationRequestDTO;
import ru.neoflex.msapplication.model.LoanOfferDTO;

import java.util.List;

@Service
@AllArgsConstructor
public class ApplicationService {
    private final DealClient dealClient;

    public List<LoanOfferDTO> createLoanApplication(LoanApplicationRequestDTO req) {
        return dealClient.createApplication(req).getBody();
    }

    public void applyOffer(LoanOfferDTO loanOfferDTO) {
        dealClient.applyOffer(loanOfferDTO);
    }
}
