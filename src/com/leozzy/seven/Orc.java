package com.leozzy.seven;

/**
 * Created by Leo
 */

class Villain{
    private String name;
    protected void set(String name){
        this.name = name;
    }
    public Villain(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "i am a Villain and my name is " + name;
    }
}

public class Orc extends Villain{
    private int orcNumber;
    public Orc(String name,int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name,int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString(){
        return "Orc " + orcNumber + " : " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger",12);
        System.out.println(orc);
        orc.change("Bob",19);
        System.out.println(orc);
    }
}
