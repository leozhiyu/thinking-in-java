package com.leozzy.eleven.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Leo
 * @create 2018-02-02 8:40
 * @desc
 */
public class PetMap {
    public static void main(String[] args) {
        Random ran = new Random(47);
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0;i <= 10000;i++){
            int key = ran.nextInt(20);
            Integer count = m.get(key);
            m.put(key,count == null ? 1 : count+1);
        }
        System.out.println(m);
    }
}
