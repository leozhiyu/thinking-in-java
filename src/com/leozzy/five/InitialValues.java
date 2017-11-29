package com.leozzy.five;

/**
 * Created by Leo
 * 基本类型的默认初始值
 */
public class InitialValues {
    boolean b;
    byte by;
    char c;
    short s;
    int i;
    long l;
    float f;
    double d;

    public static void main(String[] args) {
        InitialValues initialValues = new InitialValues();
        System.out.println("boolean : " + initialValues.b);
        System.out.println("byte : " + initialValues.by);
        System.out.println("char : " + initialValues.c);
        System.out.println("short : " + initialValues.s);
        System.out.println("int : " + initialValues.i);
        System.out.println("long : " + initialValues.l);
        System.out.println("float : " + initialValues.f);
        System.out.println("double : " + initialValues.d);
    }
}
