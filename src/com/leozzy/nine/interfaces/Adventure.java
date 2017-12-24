package com.leozzy.nine.interfaces;

import java.awt.*;

/**
 * Created by Leo
 */
interface CanFight{
    void fight();
}
interface CanSwin{
    void swin();
}
interface CanFly{
    void fly();
}
class ActionCharacter{
    public void fight(){
        System.out.println("ActionCharacter.fight()");
    }
}
class Hero extends ActionCharacter implements CanFight,CanSwin,CanFly{
    @Override
    public void swin(){
        System.out.println("Hero.swin()");
    }
    @Override
    public void fly(){
        System.out.println("Hero.fly()");
    }
}
public class Adventure {
    public static void t(CanFight x){
        x.fight();
    }
    public static void u(CanSwin x){
        x.swin();
    }
    public static void v(CanFly x){
        x.fly();
    }
    public static void w(ActionCharacter x){
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
