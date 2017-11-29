package com.leozzy.five;

import java.util.Random;

/**
 * Created by Leo
 * 数组的创建是在运行时刻确定的
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(System.currentTimeMillis());
        a = new int[rand.nextInt(20)];
        System.out.println(a.length);
    }
}
