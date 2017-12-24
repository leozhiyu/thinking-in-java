package com.leozzy.nine;

/**
 * Created by Leo
 */
public class FinallyTest {
    public static String output = "";
    public static void foo(int i){
        try {
            if (i == 1){
                System.out.println("if");
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("catch");
            output += "2";
            System.out.println("catch after + ");
            return;
        }finally {
            System.out.println("finally");
            output += "3";
        }
        output += "4";
        System.out.println("out");
    }

    public static void main(String[] args) {
        foo(0);
        foo(1);
        System.out.println(output);
    }
}
