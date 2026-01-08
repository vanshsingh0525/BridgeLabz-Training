package loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int termInMonths) {
        super(applicant, "Home Loan", termInMonths, 8.5);
    }

    @Override
    public boolean approveLoan() {
        if (basicEligibilityCheck() && applicant.getCreditScore() >= 700) {
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

