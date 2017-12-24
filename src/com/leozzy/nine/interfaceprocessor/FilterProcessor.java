package com.leozzy.nine.interfaceprocessor;

/**
 * Created by Leo
 */
class Filterdapter implements Processor{
    Filter filter;
    public Filterdapter(Filter filter){
        this.filter = filter;
    }
    @Override
    public String name(){
        return filter.name();
    }
    @Override
    public Waveform process(Object input){
        return filter.process((Waveform) input);
    }
}

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new Filterdapter(new LowPass(1.0)),w);

    }
}
