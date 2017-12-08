package com.leozzy.eleven.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Created by Leo
 */
public class ComparatorSort {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog(12, "tom"));
        dogList.add(new Dog(10, "lay"));
        dogList.add(new Dog(15, "bob"));
        dogList.add(new Dog(3, "lucy"));
        System.out.println(dogList);
        Comparator<Dog> comparator = new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                if (o1 != null && o2 != null){
                    if (o1.getName() != null){
                        return o1.getName().compareTo(o2.getName());
                    }
                }
                return 0;
            }
        };
        dogList.sort(comparator);
        Collections.sort(dogList,comparator);
        System.out.println(dogList);
    }
}
