package br.dev.loans.app.service;

import br.dev.loans.app.dtos.CustomerLoanRequestDto;
import br.dev.loans.app.dtos.CustomerLoanResponseDto;
import br.dev.loans.app.entities.Loans;
import br.dev.loans.app.entities.enums.LoanType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoansService {

    public CustomerLoanResponseDto checkLoans(CustomerLoanRequestDto requestDto) {

        List<Loans> loans = new ArrayList<>();

        if (requestDto.income() <= 3000.00) {
            Loans newLoan = new Loans(LoanType.PERSONAL);
            if (!loans.contains(newLoan)) {
                loans.add(newLoan);
            }
        }

        if (requestDto.income() >= 3000.00 &&
                requestDto.income() <= 5000.00 &&
                requestDto.age() < 30 &&
                requestDto.location().equalsIgnoreCase("SP")) {
            Loans newLoan = new Loans(LoanType.PERSONAL);
            if (!loans.contains(newLoan)) {
                loans.add(newLoan);
            }
        }

        if (requestDto.income() >= 5000.00) {
            Loans newLoan = new Loans(LoanType.CONSIGNMENT);
            if (!loans.contains(newLoan)) {
                loans.add(newLoan);
            }
        }


        if (requestDto.income() <= 3000.00) {
            Loans newLoan = new Loans(LoanType.GUARANTEED);
            if (!loans.contains(newLoan)) {
                loans.add(newLoan);
            }
        }

        if (requestDto.income() >= 3000.00 &&
                requestDto.income() <= 5000.00 &&
                requestDto.age() < 30 &&
                requestDto.location().equalsIgnoreCase("SP")) {
            Loans newLoan = new Loans(LoanType.GUARANTEED);
            if (!loans.contains(newLoan)) {
                loans.add(newLoan);
            }
        }

        return new CustomerLoanResponseDto(requestDto.name(), loans);
    }


}
