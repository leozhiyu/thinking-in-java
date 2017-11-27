package com.leozzy.five;

/**
 * Created by Leo
 * this 将当前对象传递给其他方法
 */

public class PassingThis {
    public static void main(String[] args) {
        new People().eatApple(new Apple());
    }
}

class People{
    void eatApple(Apple apple){
        System.out.println("创建一个苹果");
        Apple peeledApple = apple.getPeeled();
        System.out.println("吃苹果");
    }
}

class Apple{
    Apple getPeeled(){
       return Peel.peel(this);

    }
}
class Peel{
    public static Apple peel(Apple apple){
        System.out.println("苹果被削皮");
        return apple;
    }
}


