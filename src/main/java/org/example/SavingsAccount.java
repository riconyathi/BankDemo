package org.example;

public class SavingsAccount implements BankAccount{
    private double rate = 0.01;
    private int acctnum;
    private int balance = 0;
    private boolean isforeign = false;

    public SavingsAccount(int acctnum){
        this.acctnum = acctnum;
    }


    public boolean isforeign() {
        return isforeign;
    }

    @Override
    public int getAcctNum() {
        return acctnum;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public boolean isForeign() {
        return isforeign;
    }

    @Override
    public void setForeign(boolean isforeign) {
            this.isforeign = isforeign;
    }


    public void deposit(int amt){
        balance += amt;
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
}
