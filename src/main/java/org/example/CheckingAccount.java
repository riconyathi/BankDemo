package org.example;

public abstract class CheckingAccount extends AbstractBankAccount{

    protected CheckingAccount(int acctnum) {
        super(acctnum);
    }


    @Override
    public boolean hasEnoughCollateral(int loanamt){

       return balance >= 2 * loanamt/3;
    }

    @Override
    public abstract void addInterest();

    public abstract String toString();

    @Override
    public int compareTo(BankAccount ba) {
        int bal1 = getBalance();
        int bal2 = ba.getBalance();
        if(bal1 == bal2)
            return getAcctNum() - ba.getAcctNum();
        else
            return bal1-bal2;
    }
}
