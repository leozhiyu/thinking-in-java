package com.leozzy.nine.interfaces;

        import java.util.Random;

/**
 * Created by Leo
 */
public class RandomDoubles {
    private static Random ran = new Random(47);
    public static double next(){
        return ran.nextDouble();
    }
    public static void main(String[] args) {
        for (int i = 0; i < 7;i++){
            System.out.println(RandomDoubles.next());
        }
    }
}
