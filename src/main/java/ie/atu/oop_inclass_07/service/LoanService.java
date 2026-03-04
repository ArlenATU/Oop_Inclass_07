package ie.atu.oop_inclass_07.service;

import ie.atu.oop_inclass_07.model.Loan;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Service

public class LoanService {
    private final List<Loan> loans = new ArrayList<>();

    public Loan addLoan(Loan loan) {
        loans.add(loan);
        return loan;
    }
}
