package loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int termInMonths) {
        super(applicant, "Auto Loan", termInMonths, 9.5);
    }

    @Override
    public boolean approveLoan() {
        if (basicEligibilityCheck() && applicant.getCreditScore() >= 680) {
            setLoanStatus("APPROVED");
            return true;
        }
        setLoanStatus("REJECTED");
        return false;
    }

    @Override
    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = termInMonths;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}

