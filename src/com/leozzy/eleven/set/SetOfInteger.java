package com.leozzy.eleven.set;

import java.util.*;

/**
 * @author Leo
 * @create 2018-02-01 8:52
 * @desc
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for (int i = 0;i < 10000;i++){
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
}
