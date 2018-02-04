package com.leozzy.eleven.collection;

import java.util.Arrays;

/**
 * @author Leo
 * @create 2018-02-04 12:38
 * @desc
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> it){
        for (T t : it){
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A","B","C"};
        //test(strings);
        test(Arrays.asList(strings));
    }
}
