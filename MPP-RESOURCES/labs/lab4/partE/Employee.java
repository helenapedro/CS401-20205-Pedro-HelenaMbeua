package labs.lab4.partE;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> accounts;

    public Employee(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public double computeUpdatedBalanceSum() {
        return accounts.stream()
                .mapToDouble(Account::computeUpdatedBalance)
                .sum();
    }

    public void addAccount(Account acc) {
        if (acc == null) throw new IllegalArgumentException("account required");

        if(!accounts.contains(acc))
            accounts.add(acc);
    }

    public List<Account> getAccounts() {
        return List.copyOf(accounts);
    }

    public String getName() {
        return name;
    }
}
