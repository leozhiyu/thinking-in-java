package com.leozzy.eleven.list;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Leo
 * @create 2018-01-30 9:20
 * @desc 迭代器统一了对容器的访问方式
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> it){
        while(it.hasNext()){
            Pet p = it.next();
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
    }
}
