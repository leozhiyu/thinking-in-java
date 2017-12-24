package com.leozzy.ten.back;

/**
 * Created by Leo
 */
interface DoJob{
    void fillBlank(int a,int b,int result);
}

class SuperCalculator{
    public static void add(int a,int b,DoJob doJob){
        int result = a+b;
        doJob.fillBlank(a,b,result);
    }
}

class Worker{
    private String name;
    public Worker(String name){
        this.name = name;
    }

    public void callHelp(int a,int b){
        SuperCalculator.add(a,b,new DoHomeWork());
    }

    public class DoHomeWork implements DoJob{
        @Override
        public void fillBlank(int a, int b, int result) {
            System.out.println(name + " 求助小红的帮助计算 " + a + " + " + b + " = " + result);
        }
    }

}

class Seller{
    private String name;
    public Seller(String name){
        this.name = name;
    }

    public class DoHomeWork implements DoJob{
        @Override
        public void fillBlank(int a, int b, int result) {
            System.out.println(name + " 求助小红的帮助计算 " + a + " + " + b + " = " + result);
        }
    }
    public void callHelp(int a,int b){
        SuperCalculator.add(a,b,new DoHomeWork());
    }

}

public class MyCalculator {
    public static void main(String[] args) {
        Worker w = new Worker("小明");
        w.callHelp(1,2);

        Seller s = new Seller("老太太");
        s.callHelp(3,4);
    }
}
