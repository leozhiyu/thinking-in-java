package com.leozzy.eleven;

import java.util.*;

/**
 * Created by Leo
 * asList 底层的实现：返回的是内部类ArrayList，底层是数组，不能调整尺寸
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        boolean result = collection.addAll(Arrays.asList(moreInts));
        System.out.println(collection + "result : " + result);
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);
        System.out.println(collection);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Integer a = list.get(0);
        //list.add(21);
        //list.remove(2);
        //list.addAll(collection);
        //System.out.println(list.isEmpty());
        System.out.println(list);
        list.clear();


    }
}
