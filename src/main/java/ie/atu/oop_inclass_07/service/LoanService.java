package ie.atu.oop_inclass_07.service;

import ie.atu.oop_inclass_07.model.Loan;
import io.swagger.v3.oas.annotations.servers.Server;

import java.util.ArrayList;
import java.util.List;

@Server

public class LoanService {
    private List<Loan> loans = new ArrayList<>();

    public List<Loan> getLoans() {
        return loans;
    }

    public Loan addLoan(Loan loan) {
        loans.add(loan);
        return loan;
    }
}
