package com.leozzy.ten.innerclasses;

/**
 * Created by Leo
 */
class E{

}
abstract class F{

}
class Z extends E{
    F makeF(){
        return new F() {

        };
    }
}
public class MultiImplementation {
    static void takesE(E e){}
    static void takesF(F f){}
    public static void main(String[] args) {
         Z z = new Z();
         takesE(z);
         takesF(z.makeF());
    }
}
