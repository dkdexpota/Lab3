package com.company;

public class Karlson extends AAction{
    Karlson(Guys p, String n) {
        super(p, n);
    }
    public void Take_Offence(){
        System.out.print(getType() + " ");
        System.out.print(getName());
        super.Take_Offence();
    }

}
