package org.test;

public class TestClient {

    public static void main(String[] args){

        Operation op1 = new AddOne();
        Operation op2 = new AddTwo();
        IntProcessor p1 = new IntProcessor(op1);
        IntProcessor p2 = new IntProcessor(op2);
        p1.operateOn(6);
        p2.operateOn(6);
    }
}
