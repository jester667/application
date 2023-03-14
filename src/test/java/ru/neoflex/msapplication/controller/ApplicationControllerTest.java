package ru.neoflex.msapplication.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import ru.neoflex.msapplication.model.LoanOfferDTO;
import ru.neoflex.msapplication.service.ApplicationService;

@ExtendWith(MockitoExtension.class)
public class ApplicationControllerTest {

    @InjectMocks
    private ApplicationController applicationController;
    @Mock
    private ApplicationService applicationService;
    @Mock
    private LoanOfferDTO loanOfferDTO;

    @Test
    public void offer() {
        Assertions.assertEquals(applicationController.offer(loanOfferDTO).getStatusCode(), HttpStatus.OK);
    }
}
