package com.leozzy.six;

/**
 * Created by Leo
 * 防止直接访问构造器
 */
public class Sundae {
    public static void main(String[] args) {
        IceCream i = IceCream.getIceCream();
    }
}
class IceCream{
    private IceCream(){}
    public static IceCream getIceCream(){
        return new IceCream();
    }
}
