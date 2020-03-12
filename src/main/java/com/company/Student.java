package com.company;

public class Student implements Testable{
    String name;

    public Student(String name) {
        this.name = name;
    }
    @Override
    public void test(){
        System.out.println("successfully "+name);
    }
}
