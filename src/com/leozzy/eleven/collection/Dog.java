package com.leozzy.eleven.collection;

/**
 * Created by Leo
 * 实现 Comparable 接口，根据自定义比较规则进行比较
 */
public class Dog implements Comparable<Dog>{
    private Integer age;
    private String name;

    public Dog(Integer age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Dog another) {
        return name.compareTo(another.name);
        //return this.age - another.age;
        /*if (this.age > another.age){
            return 1;
        }else if (this.age.equals(another.age)){
            return 0;
        }else {
            return -1;
        }*/
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != null ? !age.equals(dog.age) : dog.age != null) return false;
        return name != null ? name.equals(dog.name) : dog.name == null;
    }

    @Override
    public int hashCode() {
        int result = age != null ? age.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
