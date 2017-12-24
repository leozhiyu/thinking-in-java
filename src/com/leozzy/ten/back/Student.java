package com.leozzy.ten.back;

/**
 * Created by Leo
 */
class Calculator{
    public int add(int a,int b){
        return a+b;
    }

    public void addWithStudent(int a,int b,Student xiaoming){
        int result = a+b;
        xiaoming.fillBlank3(a,b,result);
    }
}
public class Student {

    private String name = null;

    public Student(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int calcADD(int a,int b){
        return a+b;
    }

    private int userCalculator(int a,int b){
        return new Calculator().add(a,b);
    }

    public void fillBlank1(int a,int b){
        int result = calcADD(a,b);
        System.out.println(name + " 心算:" + a + " + " + b + " = " + result);
    }
    public void fillBlank2(int a,int b){
        int result = userCalculator(a,b);
        System.out.println(name + " 计算机:" + a + " + " + b + " = " + result);
    }

    public void callHelp(int a,int b){
        new Calculator().addWithStudent(a,b,this);
    }

    public void fillBlank3(int a,int b,int result){
        System.out.println(name + " 求助小红计算:" + a + " + " + b + " = " + result);
    }


}
class Test{

    public static void test01(){
        Student s = new Student("小明");
        s.fillBlank1(1,2);
    }
    public static void test02(){
        Student s = new Student("小明");
        s.fillBlank2(168,291);
    }
    public static void test03(){
        Student s = new Student("小明");
        s.callHelp(1234,453451);
    }

    public static void main(String[] args) {
        Test.test01();
        Test.test02();
        Test.test03();
    }
}
