package com.company;

public class Bludo extends AAction{
    Bludo(Guys p, String n) {
        super(p, n);
    }
    public void Moved(){
        System.out.print(getType() + " ");
        System.out.print(getName());
        super.Moved();
    }

}
