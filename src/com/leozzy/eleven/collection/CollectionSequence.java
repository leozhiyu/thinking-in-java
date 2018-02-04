package com.leozzy.eleven.collection;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * @author Leo
 * @create 2018-02-03 9:16
 * @desc
 */
public class CollectionSequence extends AbstractCollection<Pet>{
    private Pet[] pets = Pets.createArray(8);
    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();

    }
}
