package com.leozzy.ten;

/**
 * Created by Leo
 */
public class B {
    U[] uarr = new U[5];
    int index = 0;
    public void makeUArr(U u){
        uarr[index] = u;
        index++;
    }
    public void makenull(){
        uarr = null;
    }
    public void show(){
        if (uarr != null){
            for (U u : uarr){
                System.out.println(u + "idnex : " + index--);
            }
        }

    }

    public static void main(String[] args) {
        A[] arr = new A[5];
        U[] uarr = new U[5];
        B b = new B();
        for (int i = 0;i < arr.length;i++){
            arr[i] = new A();
            uarr[i] = arr[i].makeU();
            b.makeUArr(uarr[i]);
        }
        b.show();
        b.makenull();
        b.show();
    }
}
