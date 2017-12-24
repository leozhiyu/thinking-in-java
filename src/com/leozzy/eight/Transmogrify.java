package com.leozzy.eight;

/**
 * Created by Leo
 */
class Actor{
    public void act(){
    }
}
class HappyActor extends Actor{
    @Override
    public void act(){
        System.out.println("HappyActor");
    }
}
class SadActor extends Actor{
    @Override
    public void act(){
        System.out.println("SadyActor");
    }
}

class Stage{
    private Actor actor = new HappyActor();
    public void change(){
        actor = new SadActor();
    }
    public void performPlay(){
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
