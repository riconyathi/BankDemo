package org.example;

public class BankAccount {
    private int acctnum;
    private int balance = 0;
    private boolean isforeign = false;
    public BankAccount(int a){
        acctnum = a;
    }

    public int getAcctnum() {
        return acctnum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isIsforeign() {
        return isforeign;
    }

    public void setIsforeign(boolean isforeign) {
        this.isforeign = isforeign;
    }
}
