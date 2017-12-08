package com.leozzy.eleven;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Leo
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> collection = new HashSet<>();
        for (int i = 0;i < 10;i++){
            collection.add(i);
        }
        collection.add(3);
        for (Integer i : collection){
            System.out.println(i);
        }
    }
}
