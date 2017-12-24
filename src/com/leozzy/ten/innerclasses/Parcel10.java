package com.leozzy.ten.innerclasses;

/**
 * Created by Leo
 */
public class Parcel10 {
    public Destination destination(final String dest,float price){
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100){
                    System.out.println("over budget");
                }
            }
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public Destination destination(final String dest){
        return new Destination() {
            private int cost;
            {
                if (cost > 100){
                    System.out.println("over budget");
                }
            }
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("leo",101.395f);
    }
}
