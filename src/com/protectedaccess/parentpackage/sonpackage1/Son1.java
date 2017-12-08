package com.protectedaccess.parentpackage.sonpackage1;

import com.protectedaccess.parentpackage.Parent;
import com.protectedaccess.parentpackage.sonpackage2.Son2;

/**
 * Created by Leo
 */
public class Son1 extends Parent{
    public static void main(String[] args) {
        // 在包外不可通过基类Parent对象访问protected方法
        Parent parent1 = new Parent();
         //parent1.getMessage(); //错误提示 : 'getMessage()' has protected access in 'com.protectedaccess.parentpackage.Parent'

        //即使是多态，只要对象是Parent，仍然不可以访问
        Parent parent2 = new Son1();
        //parent2.getMessage(); //错误提示 : 'getMessage()' has protected access in 'com.protectedaccess.parentpackage.Parent'

        // 包外子类可以访问继承下来的方法，实际上是自己继承下来的
        Son1 son1 = new Son1();
        //son1.getMessage(); // 输出：i am parent, 如果子类重写了该方法，则输出重写方法中的内容

        // 在包外的子类中，不能用另一个子类的对象访问父类中的 protected 方法
        Son2 son2 = new Son2();
        //son2.getMessage(); //错误提示 : 'getMessage()' has protected access in 'com.protectedaccess.parentpackage.Parent'

       // Parent.getMessage();
    }

    @Override
    public void getMessage(){
        System.out.println("i am son1");
    }

    private void message(){
        getMessage();
        //super.getMessage();
    }

}
