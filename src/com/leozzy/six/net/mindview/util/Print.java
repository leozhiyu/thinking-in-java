package com.leozzy.six.net.mindview.util;

import java.io.PrintStream;

/**
 * Created by Leo
 */
public class Print {
    public static void print(Object obj){
        System.out.println(obj);
    }
    public static void print(){
        System.out.println();
    }
    public static void printnb(Object obj){
        System.out.println(obj);
    }
    public static PrintStream printf(String format,Object... args){
        return System.out.printf(format,args);
    }
}
