package com.leozzy.nine.interfaceprocessor;

import java.util.Arrays;

/**
 * Created by Leo
 */
interface Processor{
    String name();
    Object process(Object input);
}
class Apply{
    public static void process(Processor p,Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(p));
    }
}

class Upcase extends StringProcessor{
    @Override
    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}
class Downcase extends StringProcessor{
    @Override
    public String process(Object input){
        return ((String)input).toLowerCase();
    }
}
class Splitter extends StringProcessor{
    @Override
    public String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}
public abstract class StringProcessor implements Processor{
    @Override
    public String name(){
        return getClass().getSimpleName();
    }
    @Override
    public abstract Object process(Object input);
    public static String s = "Ifshe weighs the same as a duck";

    public static void main(String[] args) {
        Apply.process(new Upcase(),s);
        Apply.process(new Downcase(),s);
        Apply.process(new Splitter(),s);
    }
}
