package org.example;

public class InterestChecking extends CheckingAccount {
    private double rate = 0.01;
    public InterestChecking(int acctnum) {
        super(acctnum);
    }

    public String toString(){
        return "Interest checking account "+ getAcctNum()
                + ": balance="+ getBalance() + ", is "
                + (isForeign() ? "foreign" : "domestic");

    }

    @Override
    protected String accountType() {
        return "Interest Checking";
    }

    @Override
    protected double interestRate() {
        return 0.0;
    }

    public void addInterest(){
        int newbalance = (int) (getBalance() * rate);
        deposit(newbalance);
    }
}
