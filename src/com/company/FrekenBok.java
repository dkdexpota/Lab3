package com.company;

public class FrekenBok extends AAction{
    FrekenBok(Guys p, String n) {
        super(p, n);
    }
    public void Push(){
        System.out.print(getType() + " ");
        System.out.print(getName());
        super.Push();
        Bludo bl = new Bludo(Guys.Thing, "Bludo");
        bl.Moved();
    }
    public void Suggested(){
        System.out.print(getType() + " ");
        System.out.print(getName());
        super.Suggested();
    }
    public void Beg (){
        System.out.print(getType() + " ");
        System.out.print(getName());
        super.Beg();
    }

}
