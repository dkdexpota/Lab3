package com.company;

public class Ulius extends AAction{
    Ulius(Guys p, String n) {
        super(p, n);
    }

    public void Look(){
        System.out.print(getType() + " ");
        System.out.print(getName());
        super.Look();
    }
    public void Choose(){
        System.out.print(getType() + " ");
        System.out.print(getName());
        super.Choose();
    }
    public void Do(){
        System.out.print(getType() + " ");
        System.out.print(getName());
        super.Do();
    }

}