package org.test;

public  class IntProcessor {
    private Operation op;
    public IntProcessor(Operation op){
        this.op = op;
    }

    public void operateOn(int x){
        int y = f(x);
        System.out.println(x + " becomes "+ y);
    }
    private int f(int x){
        return op.f(x);
    }
}

interface Operation{
    public int f(int x);
}

class AddOne implements Operation{

    @Override
    public int f(int x) {
        return x + 1;
    }
}

class AddTwo implements Operation{

    @Override
    public int f(int x) {

        return x + 2;
    }
}


