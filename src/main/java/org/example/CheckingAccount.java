package org.example;

public class CheckingAccount implements BankAccount{
    private double rate = 0.01;
    private int acctnum;
    private int balance = 0;
    private boolean isforeign = false;

    public CheckingAccount(int acctnum) {
        this.acctnum = acctnum;
    }


    @Override
    public int getAcctNum() {
        return acctnum;
    }

    @Override
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
    @Override
    public void deposit(int amt){
        balance += amt;
    }

    @Override
    public boolean hasEnoughCollateral(int loanamt){

       return balance >= 2 * loanamt/3;
    }

    @Override
    public void addInterest() {

    }

    public String toString(){
        return "Checking account "+ acctnum + ": balance="
                + balance + " , is "
                + (isforeign ? "foreign" : " domestic");
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
