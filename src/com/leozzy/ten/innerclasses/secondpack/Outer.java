package com.leozzy.ten.innerclasses.secondpack;

import com.leozzy.ten.innerclasses.firstpack.Comm;

/**
 * Created by Leo
 */
public class Outer {
    protected class Inner implements Comm{
        // 如果此构造方法不写或者是其他访问权限，将会报错,ChildOuter将会报错
        public Inner(){
        }
        @Override
        public void say(){
            System.out.println("inner say");
        }
    }
}
