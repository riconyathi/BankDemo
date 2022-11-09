package org.example;

public interface BankAccount extends Comparable<BankAccount> {
    int getAcctNum();
    int getBalance();
    boolean isForeign();
    void setForeign(boolean isforeign);
    void deposit(int amt);
    boolean hasEnoughCollateral(int loanamt);
    void addInterest();
    String toString();
}
