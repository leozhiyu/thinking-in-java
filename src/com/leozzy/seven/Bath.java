package com.leozzy.seven;

/**
 * Created by Leo
 */
class Soap{
    private String s;
    Soap(){
        System.out.print("Soap()");
        s = "Constructor";
    }
    @Override
    public String toString(){return s;}
}

public class Bath {
    private String s1 = "Happy",s2 = "Happy",s3,s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath(){
        System.out.println("Inside Bath()");
        s3 = "joy";
        toy = 3.14f;
        castille = new Soap();
    }
    {
        System.out.println("非静态代码块");
        i = 47;
    }
    @Override
    public String toString(){
        if (s4 == null){
            s4 = "Joy";
        }
        return
                "\n start s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castille = " + castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }


}
