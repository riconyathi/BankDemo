package org.example;

public class Foreign implements OwnerStrategy{
    @Override
    public boolean isForeign(){
        return true;
    }

    @Override
    public int fee() {
        return 500;
    }

    public String toString(){
        return "foreign";
    }
}
