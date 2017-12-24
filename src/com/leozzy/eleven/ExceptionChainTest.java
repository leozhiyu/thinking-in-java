package com.leozzy.eleven;

/**
 * Created by Leo
 */
public class ExceptionChainTest {
    class CustomException extends Exception{
        public CustomException(){
            super();
        }
        public CustomException(String message){
            super(message);
        }
        public CustomException(String message,Throwable cause){
            super(message,cause);
        }
        public CustomException(Throwable cause){
            super(cause);
        }
    }
    // 底层测试函数
    public void func2() throws Exception{
        throw new Exception("func2 exception");
    }
    //上层测试函数
    public void func1() throws Exception{
        try {
            func2();
        }catch (Exception ex){
            throw new CustomException("func1 exception",ex);
        }
    }

    public static void main(String[] args) {
        ExceptionChainTest test = new ExceptionChainTest();
        try {
            test.func1();
        }catch (Exception e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
    }

}
