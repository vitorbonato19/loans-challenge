package br.dev.loans.app.dtos;

import java.math.BigDecimal;

public record CustomerLoanRequestDto(String cpf, int age, String name, Double income, String location) {
}
