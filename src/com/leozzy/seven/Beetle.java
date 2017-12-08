package com.leozzy.seven;

/**
 * Created by Leo
 */
class Insect{
    private int i = 9;
    protected int j;

    public Insect() {
        System.out.println("i = " + i + " , j = " + j);
        j = 39;
    }



    private static int x1 = printInit("static Insect.x1 initializeed");

    static int printInit(String s){
        System.out.println(s);
        return 47;
    }

    static {
        System.out.println("静态代码块");
    }
}

public class Beetle { //如果继承Insect顺序会有所改变
    static {
        System.out.println("Beetle static1");
    }

    private int k = Insect.printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
    }

    private static int x2 = Insect.printInit("static Beetle.x2 initialized");

    static {
        System.out.println("Beetle static2");
    }

    public static void main(String[] args) {
        //Beetle b = new Beetle();//

    }
}
