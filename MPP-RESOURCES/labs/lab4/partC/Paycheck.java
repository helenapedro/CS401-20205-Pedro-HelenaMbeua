package labs.lab4.partC;

final public class Paycheck {
    private double grossPay, fica, state, local, medicare, socialSecurity;

    public Paycheck(double grossPay, Tax fica, Tax state,
                    Tax local, Tax medicare, Tax socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica.getVal();
        this.state = state.getVal();
        this.local = local.getVal();
        this.medicare = medicare.getVal();
        this.socialSecurity = socialSecurity.getVal();
    }

    public double getNetPay() {
        return grossPay - grossPay * fica
                - grossPay * state
                - grossPay * local
                - grossPay * medicare
                - grossPay * socialSecurity;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Paystub: \n "
                + "  Gross Pay: " + grossPay + "\n"
                + "  Fica: " + fica  + "\n"
                + "  State: " + state  + "\n"
                + "  Local: " + local  + "\n"
                + "  Medicare: " + medicare  + "\n"
                + "  Social Security: " + socialSecurity  + "\n"
                + "  NET PAY: " + getNetPay();
    }
}
