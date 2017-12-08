package com.leozzy.six.access.sonpackage;

import com.leozzy.six.access.FatherClass;

/**
 * Created by Leo
 */
public class SonClass2 extends FatherClass{
    public static void main(String[] args) {
        SonClass son = new SonClass();
        //son.print(); 不可通过另一个类来访问父类的protected方法
    }
}
