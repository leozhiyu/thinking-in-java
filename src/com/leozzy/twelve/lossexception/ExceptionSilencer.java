/**
 * @author:Leo
 * @create 2018/2/28
 * @desc
 */
package com.leozzy.twelve.lossexception;

public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }finally {
            return;
        }
    }
}
