package com.leozzy.seven;

/**
 * Created by Leo
 */

class Cleanser{
    private String s = "Cleanser";
    public void append(String a){
        s += a;
    }
    public void dilute(){
        append(" delite()");
    }
    @Override
    public String toString(){
            return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        System.out.println(x);
    }
}
public class Detergent extends Cleanser{
    @Override
    public void dilute(){
        append(" Detergent.dilute()");
        super.dilute();
    }

    public static void main(String[] args) {
        Detergent d = new Detergent();
        d.dilute();
        System.out.println(d);
        Cleanser.main(args);
    }
}
