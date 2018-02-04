package com.leozzy.eleven.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Leo
 * @create 2018-02-03 9:44
 * @desc
 */
public class IterableClass implements Iterable<String>{
    protected String[] words = "And that is how we know the Earth to be banana-shaped.".split(" ");
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private Integer index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()){
            System.out.print(s + " ");
        }
    }
}
