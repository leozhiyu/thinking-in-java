package com.leozzy.seven.finalKey;

/**
 * Created by Leo
 */
class WithFinals{
    private final void f(){
        System.out.println("withFinals.f()");
    }

    private void g(){
        System.out.println("withFinals.g()");
    }
}
class OverridingPrivate extends WithFinals{
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }
    public void g(){
        System.out.println("OverridingPrivate.g()");
    }
}
class OverridingPrivate2 extends OverridingPrivate{
    public final void f(){
        System.out.println("OverridingPrivate2.f()");
    }
    public void g(){
        System.out.println("OverridingPrivate2.g()");
    }
}
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 o2 = new OverridingPrivate2();
        o2.f();
        o2.g();
        OverridingPrivate o1 = o2;
        o1.g();

    }
}
