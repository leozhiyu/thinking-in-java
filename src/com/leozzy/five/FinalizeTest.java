package com.leozzy.five;

/**
 * Created by Leo
 *
 * 当该对象不被引用时，垃圾回收器更容易将其回收
 */
public class FinalizeTest {
    public static void main(String[] args) {
        Finalize f = new Finalize();
        f = null;
        System.gc();
    }
}

class Finalize{

    @Override
    protected void finalize(){
            System.out.println("i am finalize.");
    }

}
