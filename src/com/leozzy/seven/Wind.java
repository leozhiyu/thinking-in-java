package com.leozzy.seven;

/**
 * Created by Leo
 */

class Instrument{
    public void play(){
        System.out.println("i am instrument's play");
    }
    static void tune(Instrument instrument){
        instrument.play();
    }
}

public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
