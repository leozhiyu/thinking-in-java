package com.leozzy.eleven.list;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Leo
 * @create 2018-01-31 8:27
 * @desc
 */
public class LinkedListFeatures {

    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(0));
        System.out.println(pets);
        System.out.println(pets.getFirst());
    }
}
