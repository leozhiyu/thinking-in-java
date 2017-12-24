package com.leozzy.ten.innerclasses;

/**
 * Created by Leo
 */
public interface ClassInInterface {
    void howdy();
    class Test1{
        public void a(){
            System.out.println("A");
        }

        public static void main(String[] args) {
            new Test1().a();
        }
    }
}
class g{
    public static void main(String[] args) {
        ClassInInterface c = new ClassInInterface() {
            @Override
            public void howdy() {
                System.out.println("a");
            }
        };
        ClassInInterface.Test1 t = new ClassInInterface.Test1();


    }
}
