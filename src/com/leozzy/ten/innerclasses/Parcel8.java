package com.leozzy.ten.innerclasses;

/**
 * Created by Leo
 */
public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            @Override
            public int value(){
                System.out.println("匿名内部类");
                return 1;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
        w.value();
    }
}
