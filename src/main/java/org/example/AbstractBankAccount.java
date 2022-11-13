package org.example;

public abstract class AbstractBankAccount implements BankAccount {
    protected int acctnum;
    protected int balance = 0;
    protected boolean isforeign = false;

    protected AbstractBankAccount(int acctnum){
        this.acctnum = acctnum;
    }

    public int getAcctNum() {
        return acctnum;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    public boolean isForeign() {
        return isforeign;
    }



    public void setForeign(boolean isforeign) {
        this.isforeign = isforeign;
    }

    @Override
    public void deposit(int amt) {
        balance +=amt;
    }

    @Override
    public int compareTo(BankAccount ba) {
        int bal1 = getBalance();
        int bal2 = ba.getBalance();
        if(bal1 == bal2)
            return getAcctNum() - ba.getAcctNum();
        else
            return bal1 - bal2;

    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof BankAccount))
            return false;
        BankAccount ba = (BankAccount) obj;
        return getAcctNum() == ba.getAcctNum();
    }

    @Override
    public  boolean hasEnoughCollateral(int loanamt){
       double ratio = collateralRatio();
       return balance >= loanamt * ratio;
    }

    public  String toString(){
        String acctype = accountType();
        return acctype + " account "+ acctnum
                + " : balance="+ balance + ", is " +
                (isforeign ? "foreign" : "domestic");
    }

    public void addInterest() {
        balance += (int) (balance * interestRate());
    }

    protected abstract double collateralRatio();

    protected abstract String accountType();

    protected abstract double interestRate();
}