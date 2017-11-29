package com.leozzy.five;

import java.util.Arrays;

/**
 * Created by Leo
 */
public class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot.ordinal());// 打印该常量的顺序
        System.out.println(Arrays.toString(Spiciness.values()));//按照常量的声明顺序构成的数组
        for (Spiciness s : Spiciness.values()){
            System.out.println(s);
        }
    }
}
