package com.leozzy.eleven.collection;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Iterator;

/**
 * @author Leo
 * @create 2018-02-03 9:34
 * @desc
 */
public class NonCollectionSequence extends PetSequence{
    public Iterator<Pet> iterator(){
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

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        Iterator it = nc.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class PetSequence{
    protected Pet[] pets = Pets.createArray(8);
}
