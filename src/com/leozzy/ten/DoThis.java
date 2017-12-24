package com.leozzy.ten;

/**
 * Created by Leo
 */
public class DoThis {
    public void f(){
        System.out.println("do this");
    }
    public class Inner{
        public DoThis getOuter(){
            return DoThis.this;
        }
    }

    public Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DoThis outer = new DoThis();
        DoThis.Inner in = outer.getInner();
        in.getOuter().f();

    }
}
