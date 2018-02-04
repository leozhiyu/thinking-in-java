package com.leozzy.eleven.map;

import typeinfo.pets.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Leo
 * @create 2018-02-02 8:47
 * @desc
 */
public class MapOfList {
    public static Map<Person,List<? extends Pet>> petPeople = new HashMap<>();
    static {
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
        petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shackleton"),new Dog("Marilyn")));
    }

    public static void main(String[] args) {
        System.out.println(petPeople.keySet());
        System.out.println(petPeople.values());
        for (Person p : petPeople.keySet()){
            for (Pet pet : petPeople.get(p)){
                System.out.println(pet);
            }
        }

    }
}
