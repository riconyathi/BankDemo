package org.example;

import java.util.Objects;

public class SavingsAccount extends AbstractBankAccount{
    private double rate = 0.01;

    private boolean isforeign = false;

    public SavingsAccount(int acctnum){
        super(acctnum);
    }

    @Override
        public boolean hasEnoughCollateral(int amt){
        return balance >= amt / 2;
    }
    @Override
    public String toString(){
       return "Savings Account "+ acctnum + ": balance=" + balance + ", is "+
               (isforeign ? "foreign" : "domestic");
    }

    public void addInterest(){
            balance += (int) (balance * rate);
    }

    @Override
    public int compareTo(BankAccount ba) {
        int bal1 = getBalance();
        int bal2 = ba.getBalance();
        if(bal1 == bal2)
            return getAcctNum() - ba.getAcctNum();
         else
            return bal1-bal2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (this == o) return true;
        SavingsAccount that = (SavingsAccount) o;
        return getAcctNum() == that.getAcctNum();
    }


}
