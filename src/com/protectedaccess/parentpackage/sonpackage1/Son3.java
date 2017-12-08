package com.protectedaccess.parentpackage.sonpackage1;

import com.protectedaccess.parentpackage.Parent;

/**
 * Created by Leo
 */
public class Son3 extends Parent{

    public static void main(String[] args) {
        //Parent.getMessage();
        Parent s = new Son3();
        s.getMessage();
    }

    public void add(){
        System.out.println("Addd");
    }

    @Override
    public void getMessage(){
        System.out.println("i am son3");
    }
}
