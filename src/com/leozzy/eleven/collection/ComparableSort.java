package com.leozzy.eleven.collection;

import java.util.*;

/**
 * Created by Leo
 *
 */
public class ComparableSort {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog(12, "tom"));
        dogList.add(new Dog(10, "lay"));
        dogList.add(new Dog(15, "bob"));
        dogList.add(new Dog(3, "lucy"));
        dogList.add(new Dog(12, "tom"));
        System.out.println(dogList);
        Collections.sort(dogList);
        System.out.println(dogList);

        System.out.println(dogList.indexOf(new Dog(12, "tom")));
        System.out.println(dogList.contains(new Dog(12, "tom")));
        System.out.println(dogList.containsAll(Arrays.asList(new Dog(12, "tom"),new Dog(10, "lay"))));
        System.out.println(dogList.remove(new Dog(12, "tom")));
        System.out.println(dogList);
        System.out.println(dogList.remove(new Dog(12, "tom")));
        System.out.println(dogList);
    }
}
