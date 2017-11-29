package com.leozzy.five;

/**
 * Created by Leo
 *
 * 通过 finalize 方法可以用来验证终结条件
 * 由此可找出某些错误
 * 比如以下程序中能发现有一本Book没有执行checkin
 *
 */

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();

        new Book(true);
        System.gc();
    }
}

class Book{

    boolean checkedOut = false;

    Book(boolean checkedOut){
        this.checkedOut = checkedOut;
    }

    void checkIn(){
        checkedOut = false;
    }

    @Override
    protected void finalize(){
        if (checkedOut){
            System.out.println("error:checked out");
        }
    }
}
