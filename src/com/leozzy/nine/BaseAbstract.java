package com.leozzy.nine;

/**
 * Created by Leo
 */
public abstract class BaseAbstract {

    public static void staticMethod(BaseAbstract baseAbstract){
        SubAbstract subAbstract = (SubAbstract) baseAbstract;
    }
}
class SubAbstract extends BaseAbstract{
    public void method(){
        System.out.println("Sub.method()");
    }


    public static void main(String[] args) {
        SubAbstract s = new SubAbstract();
    }
}

