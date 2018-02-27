/**
 * @author:18779
 * @create 2018/2/27
 * @desc
 */
package com.leozzy.twelve.customizedexception;

import com.sun.media.sound.EmergencySoundbank;

public class MyException extends Exception {
    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }
}

class FullConstructors{
    public static void f() throws MyException{
        //System.out.println("throw exception from f()");
        //throw new RuntimeException();
        throw new MyException();
    }

    public static void g(){
        //System.out.println("throw exception from g()");
        try {
            throw new MyException("exception g()");
        } catch (MyException e) {
            //System.out.println("getMessage : " + e.getMessage());
            //System.out.println(e.toString());
            e.printStackTrace();
            for (StackTraceElement element : e.getStackTrace()){
                System.out.println(element.getMethodName());
            }
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            //e.printStackTrace();
        }
        try {
            g();
        } catch (Exception e) {
            //e.printStackTrace(System.out);
        }
    }
}
