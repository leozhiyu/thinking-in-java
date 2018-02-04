package com.leozzy.eleven;

import java.util.Vector;

/**
 * Created by Leo
 */

class MyVector extends Vector{
    @Override
    public Object clone() {
       MyVector my = (MyVector) super.clone();
       int size = size();
       for (int i = 0; i < size;i++){
           Article obj = (Article)my.get(i);
           my.setElementAt(obj.clone(),i);
       }
       return my;
    }
}
class Article implements Cloneable{
    private String title;
    private String author;

    public Article(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    protected Object clone(){
        Article article = null;
        try{
            article = (Article) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return article;
    }
}

public class MutableStudent {
    private String name;
    private MyVector article;
    private String[] teachers;

    public String getName() {
        return name;
    }

    public MyVector getArticle() {
        return (MyVector) article.clone();
    }

    public String[] getTeachers() {
        return teachers.clone();
    }

    public MutableStudent(String name, MyVector article, String[] teachers) {
        this.name = name;
        this.article = (MyVector) article.clone();
        this.teachers = (String[]) teachers.clone();
    }

    public void print(){
        for (Object o : article){
            Article a = (Article)o;
            System.out.println("Student : " + name + " ; Article: " + a.getTitle() + " ; Author : " + a.getAuthor());
        }
        StringBuffer ts = new StringBuffer();
        for (String t : teachers){
            ts.append(t).append(";");
        }
        System.out.println("Student : " + name + ": Teacher :" + ts.toString());
    }

    public static void main(String[] args) {
        Article a1 = new Article("java敲黑板","chatbook");
        Article a2 = new Article("Java划重点","chatbook");
        MyVector va = new MyVector();
        va.add(a1);
        va.add(a2);

        String[] ts = new String[]{"ta","tb"};

        MutableStudent student = new MutableStudent("程序员",va,ts);
        student.print();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //student.getArticle().get(0).setTitle("Java夜无眠");
        a1.setTitle("Java夜无眠");
        student.getTeachers()[0]="ab";
        student.print();
    }
}
