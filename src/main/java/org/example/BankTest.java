package org.example;

import java.util.HashMap;

public class BankTest {

    private static HashMap<Integer, BankAccount> accounts = new HashMap<>();
    private static Bank bank = new Bank(accounts, 0);
//    private static Bank bank = new Bank();
    private static int acct = bank.newAccount(1,true);

    public static void main(String[] args) {
        verifyBalance("initial amount", 0);
        bank.deposit(acct,10);
        verifyBalance("after deposit",10);
        verifyLoan("authorize bad loan", 22, false);
        verifyLoan("authorize good loan", 20, true);
    }

    private static void verifyBalance(String msg, int expectedVal){
        int bal = bank.getBalance(acct);
        boolean ok = (bal == expectedVal);
        String result = ok ? "Good! " : "Bad! ";
        System.out.println(msg + ": " + result);
    }

    private static void verifyLoan(String msg, int loanAmt, boolean expectedVal){
        boolean answer = bank.authorizeLoan(acct, loanAmt);
        boolean ok = (answer == expectedVal);
        String result = ok ? "Good! ": "Bad! ";
        System.out.println(msg + ": "+ result);
    }
}
