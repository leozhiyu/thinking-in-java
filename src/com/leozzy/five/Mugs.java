package com.leozzy.five;

/**
 * Created by Leo
 * 实例初始化（非静态代码块）与静态初始化的执行过程一样，只不过只实例化一次
 */
class Mug{
    Mug(int marker){
        System.out.println("Mug(" + marker + ")");
    }
    void f(int marker){
        System.out.println("f(" + marker + ")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;
    Mugs(){
        System.out.println("Mugs");
    }

    Mugs(int i){
        System.out.println("Mugs(int)");
    }
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    public static void main(String[] args) {
        System.out.println("inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs() completed");
    }
}
