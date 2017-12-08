package com.leozzy.eleven;

import java.util.ArrayList;

/**
 * Created by Leo
 */
public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }

    public void hop(){
        System.out.println("gerbilNumber : " + gerbilNumber + " is hop");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> arrayList = new ArrayList();
        arrayList.add(new Gerbil(1));
        arrayList.add(new Gerbil(2));
        arrayList.add(new Gerbil(3));
        for (int i = 0; i < arrayList.size();i++){
            System.out.println(arrayList.get(i));
            arrayList.get(i).hop();
        }
    }

}
