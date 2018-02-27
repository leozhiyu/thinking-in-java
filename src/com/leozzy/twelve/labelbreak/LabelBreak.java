/**
 * @author:18779
 * @create 2018/2/28
 * @desc
 */
package com.leozzy.twelve.labelbreak;

public class LabelBreak {
    public static void main(String[] args) {
        here : for (int i = 0;i < 5;i++){
            for (int j = 0;j < 5;j++){
                if (j == i){
                    continue here;
                }
                System.out.println("i = " + i + " : j = " + j );
            }
        }
    }
}
