package com.leozzy.five;

/**
 * Created by Leo
 */

class Cup{
    Cup(int marker){
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker){
        System.out.println("f(" + marker + ")");
    }
}

class Cups{
    Cups(){
        System.out.println("cups()");
    }
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("inside main()");
        Cups.cup1.f(1);
    }
    static Cups cups1 = new Cups();
}
