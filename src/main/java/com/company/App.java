package com.company;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Printer p1=new Printer("a",5);
        Printer p2=new Printer("b",5);
        Printer p3=new Printer("c",5);
        p1.start();
        p2.start();
        p3.start();

//        String[] people1 = new String[10];
//        String[] people2 = new String[10];
//        for (int i = 0; i < people1.length; i++) {
//            people1[i] = "A" + i;
//        }
//        for (int i = 0; i < people2.length; i++) {
//            people2[i] = "B" + i;
//        }
//        Thread t1 = new ThreadQ(people1);
//        t1.setDaemon(true);
//        t1.setName("1");
//        t1.start();
//
//
//        Thread t2 = new ThreadQ(people2);
//        t2.setDaemon(true);
//        t2.setName("2");
//        t2.start();
    }

    public static  void print(String text, int count) throws InterruptedException {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
            Thread.sleep(100);
        }
    }
}

