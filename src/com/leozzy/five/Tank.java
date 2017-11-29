package com.leozzy.five;

/**
 * Created by Leo
 */
public class Tank {
    private String status = "full";

    Tank(){

    }

    Tank(String status){
        this.status = status;
    }

    @Override
    protected void finalize(){
        if (status.equals("full")){
            System.out.println("error : not empty");
        }
    }

    public static void main(String[] args) {
        Tank t1 = new Tank("empty");
        Tank t2 = new Tank();
        t2 = null;
        System.gc();
        String s = "ava";
        for (String str : s.split("")){
            System.out.println(str);
        }
    }
}
