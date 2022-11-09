package org.example;

import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class Bank {
    private HashMap<Integer, BankAccount> accounts;

   private int nextacct;

    public Bank(HashMap<Integer, BankAccount> accounts, int nextacct) {
        this.accounts = accounts;
        this.nextacct = nextacct;
    }

    public int newAccount(boolean isforeign){
        int acctnum = nextacct++;
        BankAccount ba = new BankAccount(acctnum);
        ba.setIsforeign(isforeign);
        accounts.put(acctnum,ba);
        return acctnum;
    }

    public int getBalance(int acctnum){
        BankAccount ba = accounts.get(acctnum);
        return ba.getBalance();
    }

    public void deposit(int acctnum, int amt) {
        BankAccount ba = accounts.get(acctnum);
        if(ba.isIsforeign())
            writeToLog(acctnum, amt, new Date());
        ba.deposit(amt);
    }

    private void writeToLog(int acctnum, int amt, Date date) {
    }

    public void setForeign(int acctnum, boolean isforeign){
        BankAccount ba  = accounts.get(acctnum);
        ba.setIsforeign(isforeign);
    }

    public boolean authorizeLoan(int acctnum, int loanamt){
        BankAccount ba = accounts.get(acctnum);
        return ba.hasEnoughCollateral(loanamt);
    }

    @Override
    public String toString(){
        Set<Integer> accts = accounts.keySet();
        String result = "The bank has "+ accts.size() + " accounts.";
        for (BankAccount ba : accounts.values()) {
            result += "\n\t" + ba.toString();
        }
        return result;
    }
    public void addInterest(){
                for(BankAccount ba: accounts.values())
                    ba.addInterest();
    }

}
