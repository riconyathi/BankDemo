package org.example;

public  class RegularChecking extends CheckingAccount{
    public RegularChecking(int acctnum) {
        super(acctnum);
    }

    @Override
    public String toString() {
        return "Regular checking account "+ acctnum
                + ": balance="+ balance + ", is " +
                (isforeign ? "foreign" : "domestic");
    }

    @Override
    protected String accountType() {
        return "Regular Checking";
    }

    @Override
    protected double interestRate() {
        return 0.0;
    }

    @Override
    public void addInterest() {
        //do nothing
    }
}
