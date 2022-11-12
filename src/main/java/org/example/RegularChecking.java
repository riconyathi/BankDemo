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
    public void addInterest() {
        //do nothing
    }
}
