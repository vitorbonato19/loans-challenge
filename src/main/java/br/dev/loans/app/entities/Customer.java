package br.dev.loans.app.entities;

import java.math.BigDecimal;

public record Customer(String cpf,
                       int age,
                       String name,
                       Double income,
                       String location) {
}
