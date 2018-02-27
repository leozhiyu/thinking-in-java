/**
 * @author:18779
 * @create 2018/2/27
 * @desc
 */
package com.leozzy.twelve.throwexception;

public class Rethrowing {
    public static void f() throws Exception{
        System.out.println("origin exception in f()");
        throw new Exception("throw from f()");
    }
    public static void g() throws Exception{
        try {
            f();
        }catch (Exception e){
            System.out.println("inside g(),e.printStackTrace()");
            e.printStackTrace();
            throw e;
        }
    }
    public static void h() throws Exception{
        try {
            f();
        }catch (Exception e){
            System.out.println("inside h(),e.printStackTrace()");
            e.printStackTrace();
            throw (Exception) e.fillInStackTrace();  // 返回值是Throwable，强制转型
        }
    }

    public static void main(String[] args) {
        try {
            g();
        }catch (Exception e){
            System.out.println("main:printStackTrace");
            e.printStackTrace();
        }

        try {
            h();
        }catch (Exception e){
            System.out.println("main:printStackTrace");
            e.printStackTrace();
        }
    }
}
