package labs.lab4.partE;

public class CheckingAccount extends Account{
    private double balance, monthlyFee;
    private String acctID;

    public CheckingAccount(String acctID, double startBalance, double fee) {
        this.acctID = acctID;
        this.balance = startBalance;
        this.monthlyFee = fee;
    }

    @Override
    double computeUpdatedBalance() {
        return balance - monthlyFee;
    }

    @Override
    String getAccountID() {
        return acctID;
    }

    public double getBalance() {
        return balance;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }
}
