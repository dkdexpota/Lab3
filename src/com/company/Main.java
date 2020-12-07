package com.company;
public class Main {
    public static void main(String[] args) {
        Ulius ul = new Ulius(Guys.Human, "Ulius");
        Karlson kar = new Karlson(Guys.Human, "Karlson");
        FrekenBok fb = new FrekenBok(Guys.Human, "Freken Bok");
        kar.Take_Offence();
        ul.Look();
        ul.Choose();
        ul.Do();
        fb.Push();
        fb.Beg();
    }
}
