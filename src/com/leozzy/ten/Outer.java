package com.leozzy.ten;

/**
 * Created by Leo
 */
public class Outer {
    private String name;

    Outer(){
        name = "leo";
        System.out.println("outer");
    }
    class Inner{
        private Inner(){
            System.out.println("inner");
        }

        @Override
        public String toString() {
            return name;
        }
    }
    public Inner getInstance(){
        return new Inner();
    }

    public static void main(String[] args) {
        Inner i = new Outer().getInstance();
        System.out.println(i);
    }
}
