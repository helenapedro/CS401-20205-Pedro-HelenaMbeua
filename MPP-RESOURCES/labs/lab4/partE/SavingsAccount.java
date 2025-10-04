package labs.lab4.partE;

public class SavingsAccount extends Account{
    private double balance, interestRate;
    private String acctID;

    public SavingsAccount(String acctID, double interestRate, double startBalance) {
        this.acctID = acctID;
        this.interestRate = interestRate;
        this.balance = startBalance;
    }

    @Override
    double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }

    @Override
    String getAccountID() {
        return acctID;
    }

    @Override
    double getBalance() {
        return balance;
    }
}
