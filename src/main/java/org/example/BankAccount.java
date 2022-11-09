package org.example;

public class BankAccount {
    private double rate = 0.01;
    private int acctnum;
    private int balance = 0;

    public boolean isIsforeign() {
        return isforeign;
    }

    private boolean isforeign = false;
    public BankAccount(int a){
        acctnum = a;
    }


    public int getBalance() {
        return balance;
    }

    public void setIsforeign(boolean isforeign) {
        this.isforeign = isforeign;
    }

    public void deposit(int amt){
        balance += amt;
    }

    public boolean hasEnoughCollateral(int amt){
      return balance >= amt / 2;
    }

    public String toString(){
       return "Bank account "+ acctnum + ": balance=" + balance + ", is "+
               (isforeign ? "foreign" : "domestic");
    }

    public void addInterest(){
        balance += (int) (balance * rate);
    }
}
