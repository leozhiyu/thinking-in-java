package com.leozzy.ten;

/**
 * Created by Leo
 */
interface MySelector{
    boolean end();
    Object current();
    void next();
}
public class MySequence {
    private Object[] elements;
    private int next = 0;

    MySequence(int length){
        elements = new Object[length];
    }

    public void add(Object x){
        if (next < elements.length){
            elements[next++] = x;
        }
    }

    private class MySequenceSelector implements MySelector{
        private int i= 0;

        @Override
        public boolean end(){
            return i < elements.length ? true : false;
        }
        @Override
        public Object current(){
            return elements[i];
        }

        @Override
        public void next() {
            if (i < elements.length){
                i++;
            }
        }
    }

    public MySelector myselector(){
        return new MySequenceSelector();
    }

    public static void main(String[] args) {
        MySequence mySequence = new MySequence(10);
        for (int i = 0; i < 10;i++){
            mySequence.add(Integer.toString(i));
        }
        MySelector mySelector = mySequence.myselector();
        while(mySelector.end()){
            System.out.println(mySelector.current() + " ");
            mySelector.next();
        }
    }
}
