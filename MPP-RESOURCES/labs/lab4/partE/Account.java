package labs.lab4.partE;

import java.util.Objects;

abstract public class Account {
    abstract String getAccountID();
    abstract double getBalance();
    abstract double computeUpdatedBalance();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Account acct)) return false;
        return  Objects.equals(getAccountID(), acct.getAccountID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountID());
    }
}
