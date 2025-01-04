package br.dev.loans.app.entities;

import br.dev.loans.app.entities.enums.LoanType;
import org.springframework.stereotype.Component;

import java.util.Objects;

public class Loans {

    private LoanType loanType;
    private Double interestRate;

    public Loans() {

    }

    public Loans(LoanType loanType) {
            this.loanType = loanType;
        switch (loanType) {
            case PERSONAL -> this.interestRate = 4.0;
            case GUARANTEED -> this.interestRate =3.0;
            case CONSIGNMENT -> this.interestRate = 2.0;
        }
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loans loans = (Loans) o;
        return loanType == loans.loanType && Objects.equals(interestRate, loans.interestRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanType, interestRate);
    }
}
