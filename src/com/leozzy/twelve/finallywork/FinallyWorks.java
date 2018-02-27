/**
 * @author:18779
 * @create 2018/2/27
 * @desc
 */
package com.leozzy.twelve.finallywork;

class ThreeException extends Exception{}

public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true){
            try {
                if (count++ == 0){
                    throw new ThreeException();
                }
                System.out.println("No exception");
            }catch (ThreeException e){
                System.out.println("exception");
            }finally {
                System.out.println("in finally caluse");
                if (count == 2){
                    break;
                }
            }
        }
    }
}
