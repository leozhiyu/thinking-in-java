/**
 * @author:Leo
 * @create 2018/3/6
 * @desc
 */
package com.leozzy.twelve.throwexception;

import java.io.FileNotFoundException;
import java.io.IOException;

class WrapCheckedException{
    void throwRuntimeException(int type){
        try {
            switch (type){
                case 0:throw new FileNotFoundException();
                case 1:throw new IOException();
                case 2:throw new RuntimeException("where am i");
                default:return;
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception{}

public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();
        wce.throwRuntimeException(3);

        for (int i = 0; i < 4;i++){
            try {
                if (i < 3){
                    wce.throwRuntimeException(i);
                }else {
                    throw new SomeOtherException();
                }
            }catch (SomeOtherException e){
                System.out.println("SomeOtherException : " + e);
            }catch (RuntimeException re){
                try {
                    throw re.getCause();
                }catch (FileNotFoundException e){
                    System.out.println("FileNotFoundException : "+e);
                }catch (IOException e){
                    System.out.println("IOException : " + e);
                }catch (RuntimeException e){
                    System.out.println("RuntimeException : " + e);
                }catch (Throwable e){
                    System.out.println("Throwable : " + e);
                }
            }
        }
    }
}
