package br.dev.loans.app.dtos;

import br.dev.loans.app.entities.Loans;

import java.util.List;

public record CustomerLoanResponseDto(String customer, List<Loans> loans) {


}
