package br.dev.loans.app.controller;

import br.dev.loans.app.dtos.CustomerLoanRequestDto;
import br.dev.loans.app.dtos.CustomerLoanResponseDto;
import br.dev.loans.app.service.LoansService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/customer-loans")
public class CustomerController {

    private final LoansService loansService;

    public CustomerController(LoansService loansService) {
        this.loansService = loansService;
    }

    @PostMapping
    public ResponseEntity<CustomerLoanResponseDto> postTheCustomerLoans(@RequestBody @Valid CustomerLoanRequestDto requestDto) {
        var response = loansService.checkLoans(requestDto);
        return ResponseEntity.status(200).body(response);
    }
}
