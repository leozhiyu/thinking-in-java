package com.leozzy.eight;

/**
 * Created by Leo
 */
class Super{
    public int field = 0;
    public int getField(){
        return field;
    }
}

class Sub extends Super{
    public int field = 1;
    @Override
    public int getField(){
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());


    }
}
