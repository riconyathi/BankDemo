package org.example;

import java.util.Scanner;
import java.util.Set;

public class BankClient {
    private int current = -1;
    private Scanner scanner = new Scanner(System.in);
    private boolean done = false;
    private Bank bank = new Bank();

    public void run(){
        scanner = new Scanner(System.in);
        while(!done){
            System.out.println("Enter command (0=quit, 1=new, 2=select, 3=deposit, 4=loan, 5=show, 6=interest):");
            int cmd = scanner.nextInt();
            processCommand(cmd);
        }
        scanner.close();
    }

    private void processCommand(int cmd) {

        if(cmd == 0)  quit();
        else if(cmd == 1) newAccount();
        else if(cmd == 2) select();
        else if(cmd == 3) deposit();
        else if(cmd == 4) authorizeLoan();
        else if(cmd == 5) showAll();
        else if(cmd == 6) addInterest();
        else
            System.out.println("illegal command");

    }

    private void quit() {
        done = true;
        System.out.println("Goodbye!");
    }

    private void newAccount() {
        current = bank.newAccount();
        System.out.println("Your new account number is "+ current);
    }

    private void select() {
        System.out.println("Enter account#: ");
        current = scanner.nextInt();
        int balance = bank.getBalance(current);
        System.out.println("The balance of account " + current + " is "+ balance);
    }

    private void deposit() {
        System.out.println("Enter deposit amount: ");
        int amt = scanner.nextInt();
        bank.deposit(current,amt);
        System.out.println(amt+" deposited into account");
    }

    private void authorizeLoan() {
        System.out.println("Enter loan amount: ");
        int loanamt = scanner.nextInt();
        if(bank.authorizeLoan(current,loanamt))
            System.out.println("Your loan is approved");
        else
            System.err.println("Your loan is denied");
    }

    private void showAll() {
        System.out.println(bank.toString());
    }

    private void addInterest() {
       bank.addInterest();
    }

}
