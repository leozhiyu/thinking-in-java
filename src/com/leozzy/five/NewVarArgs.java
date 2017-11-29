package com.leozzy.five;


import java.util.Date;

/**
 * Created by Leo
 */
public class NewVarArgs {
    static void printArray(Object... args){
        for (Object obj : args){
            System.out.println(obj + " ");
        }
    }

    public static void main(String[] args) {
        printArray(new Integer(47),new Float(3.14),new Double(11.11),"abc",new Integer[]{1,2,3,4});
    }
}
