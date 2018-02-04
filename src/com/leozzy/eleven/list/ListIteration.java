package com.leozzy.eleven.list;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * @author Leo
 * @create 2018-01-31 8:14
 * @desc
 */
public class ListIteration {


    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        while(it.hasNext()){
            System.out.println(it.next()+ ", " + it.nextIndex() + ", " + it.previousIndex());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        while (it.hasPrevious()){
            System.out.println(it.previous().id() + ", " + it.previousIndex());
        }
        System.out.println("~~~~~~~~~~~");
        System.out.println(pets);
        it = pets.listIterator(3);
        while(it.hasNext()){
            System.out.println(it.next());
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
