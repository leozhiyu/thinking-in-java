package com.leozzy.eleven;

/**
 * Created by Leo
 */
class PhoneColor{
    private String name;
    public PhoneColor(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Package implements Cloneable {
    private String name;
    private PhoneColor color;

    public Package(String name, PhoneColor color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneColor getColor() {
        return color;
    }

    public void setColor(PhoneColor color) {
        this.color = color;
    }
    @Override
    public Package clone(){
        Package pkg = null;
        try{
            pkg = (Package)super.clone();
            pkg.setColor(new PhoneColor(pkg.getColor().getName()));
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return pkg;
    }

    public void print(){
        System.out.println("Package " + getName() + " => Color is : " + getColor().getName());
    }

    public static void main(String[] args) {
        Package pkg1 = new Package("Dior",new PhoneColor("Red"));
        pkg1.print();

        Package pkg2 = pkg1.clone();
        pkg2.setName("0007");
        pkg2.getColor().setName("White");
        pkg1.print();
        pkg2.print();
    }
}
