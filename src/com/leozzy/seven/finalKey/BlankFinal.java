package com.leozzy.seven.finalKey;

/**
 * Created by Leo
 * 空白final只能通过构造函数初始化
 */
class Poppet{
    private int i;

    public Poppet(int i) {
        this.i = i;
    }
}
public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;
    public BlankFinal(){
        j = 1;
        p = new Poppet(1);
    }


    public static void main(String[] args) {
        new BlankFinal();
    }
}
