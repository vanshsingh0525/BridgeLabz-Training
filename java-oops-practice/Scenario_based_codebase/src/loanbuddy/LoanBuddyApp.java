package loanbuddy;

public class LoanBuddyApp {

    public static void main(String[] args) {

        Applicant applicant1 = new Applicant(
                "Amit Sharma", 720, 80000, 1500000);

        LoanApplication loan = new HomeLoan(applicant1, 240);

        loan.approveLoan();
        loan.showLoanDetails();
    }
}

