package com.leozzy.nine.interfaces;

/**
 * Created by Leo
 */
interface I1{
    void f();
}
interface I2{
    int f(int i);
}
interface I3{
    int f();
}
class C implements I2,I3{
    @Override
    public int f(){
        return 1;
    }
    @Override
    public int f(int i){
        return 1;
    }
}
public class InterfaceNameConflict {

}
