package com.leozzy.nine.factories;

/**
 * Created by Leo
 */
interface Cycle{
    void bike();
}
class Unicycle implements Cycle{
    @Override
    public void bike() {
        System.out.println("Unicycle bike");
    }
}
class Bicycle implements Cycle{
    @Override
    public void bike(){
        System.out.println("Bicycle bike");
    }
}
interface CycleFactory{
    Cycle getCycle();
}
class UnicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
class BicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

public class Cycles {
    public static void ride(CycleFactory factory){
        Cycle cycle = factory.getCycle();
        cycle.bike();
    }
    public static void main(String[] args) {
        ride(new UnicycleFactory());
        ride(new BicycleFactory());
    }
}
