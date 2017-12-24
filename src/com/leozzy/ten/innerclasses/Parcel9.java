package com.leozzy.ten.innerclasses;


/**
 * Created by Leo
 */
public class Parcel9 {
    public Destination destination(String dest){
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                //dest = "a"; 编译错误，不能修改
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("abc");
    }
}
