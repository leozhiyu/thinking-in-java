package com.leozzy.five;

import java.util.Arrays;

/**
 * Created by Leo
 */
public class ArrayReverse {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String[] arr1,arr2;
        if (a.length() == b.length()){
            a = "0" + a;
        }
        if(a.length() > b.length()){
            arr1 = reverse(a.split(""));
            arr2 = reverse(b.split(""));
        }else{
            arr1 = reverse(b.split(""));
            arr2 = reverse(a.split(""));
        }

        int i = 0;
        for(i = 0;i < arr2.length;i++){
            arr1[i] = Integer.toString(Integer.valueOf(arr1[i]) + Integer.valueOf(arr2[i]));
            if(arr1[i].equals("2")){
                arr1[i] = "0";
                arr1[i+1] = Integer.toString(Integer.valueOf(arr1[i+1]) + 1);
            }else if(arr1[i].equals("3")){
                arr1[i] = "1";
                arr1[i+1] = Integer.toString(Integer.valueOf(arr1[i+1]) + 1);
            }
        }
        while(i < arr1.length-1){
            if(arr1[i].equals("2")){
                arr1[i] = "0";
                arr1[i+1] = Integer.toString(Integer.valueOf(arr1[i+1]) + 1);
                i++;
            }else{
                break;
            }
        }
        arr1 = reverse(arr1);
        StringBuffer sb = new StringBuffer();
        for (String s : arr1){
            sb.append(s);
        }
        if (sb.charAt(0) == '2'){
            sb.setCharAt(0,'0');
            sb.insert(0,"1");
        }

        System.out.println(sb);
    }
    private static  String[] reverse(String[] arr){
        for (int i = 0;i < arr.length/2;i++){
            String temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
}
