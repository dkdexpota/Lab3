package com.company;

abstract class AAction implements IComprasion, IObject{
    Guys type;
    private String Name;

    AAction(Guys p, String n) {
        type = p;
        Name = n;
    }
    public Guys getType(){
        return type;
    }
    public String getName(){
        return Name;
    }
    public void Look(){
        System.out.println(" строго посмотрел на Карлсона");
    }
    public void Choose (){
        System.out.println(" решил, что не заслуживает внимания");
    }
    public void Do (){
        System.out.println(" сново занялся цыпленком");
    }
    public void Push (){
        System.out.println(" пододвинула блюдо");
    }
    public void Suggested (){
        System.out.println(" предлогала");
    }
    public void Beg () {
        System.out.println(" умоляла взять еще кусочек");
    }

    public void Moved(){
        System.out.println(" пододвинулось");
    }
    public void Take_Offence() {
        System.out.println(" обиделся не на шутку");
    }
    @Override
    public String toString() {
        return getName() + type;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public int hashCode() {
        return getName().hashCode() + type.hashCode();
    }
}
