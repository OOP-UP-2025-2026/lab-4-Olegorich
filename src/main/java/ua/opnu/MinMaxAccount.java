package ua.opnu;

import ua.opnu.java.inheritance.account.BankingAccount;
import ua.opnu.java.inheritance.account.Credit;
import ua.opnu.java.inheritance.account.Debit;
import ua.opnu.java.inheritance.account.Startup;

public class MinMaxAccount  extends BankingAccount {

    int min;
    int max;

    public MinMaxAccount(Startup s) {
        super(s);
        min = s.getBalance();
        max = s.getBalance();
    }

    @Override
    public void debit(Debit deb) {
        super.debit(deb);
        if (max < this.getBalance())
            max = this.getBalance();
    }

    @Override
    public void credit(Credit cred) {
        super.credit(cred);
        if (min > this.getBalance())
            min = this.getBalance();
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
