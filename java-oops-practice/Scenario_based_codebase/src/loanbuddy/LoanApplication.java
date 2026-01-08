package loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected String loanType;
    protected int termInMonths;
    protected double interestRate;
    protected Applicant applicant;

    private String loanStatus;   // Restricted access

    public LoanApplication(Applicant applicant, String loanType,
                           int termInMonths, double interestRate) {

        this.applicant = applicant;
        this.loanType = loanType;
        this.termInMonths = termInMonths;
        this.interestRate = interestRate;
        this.loanStatus = "PENDING";
    }

    protected void setLoanStatus(String status) {
        this.loanStatus = status;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    protected boolean basicEligibilityCheck() {
        return applicant.getCreditScore() >= 650 &&
               applicant.getIncome() >= applicant.getLoanAmount() * 0.3;
    }

    public void showLoanDetails() {
        System.out.println("Applicant: " + applicant.getName());
        System.out.println("Loan Type: " + loanType);
        System.out.println("Loan Status: " + loanStatus);
        System.out.println("Monthly EMI: " + calculateEMI());
    }
}

