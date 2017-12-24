package com.leozzy.nine.factories;

/**
 * Created by Leo
 */
interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}
class Impl1 implements Service{
    @Override
    public void method1(){
        System.out.println("Impl1 method1");
    }
    @Override
    public void method2(){
        System.out.println("Impl1 method2");
    }
}
class Impl1Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Impl1();
    }
}
class Impl2 implements Service{
    @Override
    public void method1(){
        System.out.println("Impl2 method1");
    }
    @Override
    public void method2(){
        System.out.println("Impl2 method2");
    }
}
class Impl2Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Impl2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory factory){
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Impl1Factory());
        serviceConsumer(new Impl2Factory());
    }
}
