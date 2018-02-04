package com.leozzy.eleven;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

/**
 * Created by Leo
 */
class Color{
    private String name;

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Package implements Cloneable{
    private String name;
    private Color color;

    public Package(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    protected Object clone() {
        Package p = null;
        try {
            p = (Package) super.clone();
            p.setColor(new Color(p.getColor().getName()));
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }

    public void print(){
        System.out.println("Package" + getName() + " => Color is " + getColor().getName());
    }

    public static void main(String[] args) {
        Package p1 = new Package("Dior",new Color("red"));
        p1.print();
        Package p2 = (Package) p1.clone();
        p2.setName("0007");
        p2.getColor().setName("White");
        p1.print();
        p2.print();



    }
}
