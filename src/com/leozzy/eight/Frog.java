package com.leozzy.eight;

import sun.security.krb5.internal.crypto.Des;

/**
 * Created by Leo
 */

class Characteristic{
    private String s;
    Characteristic(String s){
        this.s = s;
        System.out.println("Creating Characteristic " +s);
    }
    protected void dispose(){
        System.out.println("disposing Characteristic" + s);
    }
}
class Description{
    private String s;
    Description(String s){
        this.s = s;
        System.out.println("Creating Description " +s);
    }
    protected void dispose(){
        System.out.println("disposing Description" + s);
    }

}

class LivingCreaure{
    private Characteristic p = new Characteristic("is alive");
    private Description t = new Description("Basic Living Creature");
    LivingCreaure(){
        System.out.println("Creating LivingCreaure");
    }
    protected void dispose(){
        System.out.println("disposing LivingCreaure");
        t.dispose();
        p.dispose();
    }
}
class Animal extends LivingCreaure{
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("Animal not vegetable");
    Animal(){
        System.out.println("Animal");
    }
    @Override
    protected void dispose(){
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
class Amphibian extends Animal{
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");
    Amphibian(){
        System.out.println("Amphibian");
    }
    @Override
    protected void dispose(){
        System.out.println("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
public class Frog extends Amphibian{
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");
    public Frog(){
        System.out.println("frog()");
    }
    @Override
    protected void dispose(){
        System.out.println("public class Frog extends Amphibian{\n dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Bye~~~~~~~~~~");
        frog.dispose();
    }
}
