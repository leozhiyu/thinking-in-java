package com.leozzy.eleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Leo
 */
public class ListFeatures {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
