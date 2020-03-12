package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan");
        student.test();
        Testable unknown = () -> System.out.println("Tested");
        Testable person1 = () -> System.out.println("Haskell Karry");
        person1.test();
        Testable person2 = () -> System.out.println("Alonzo Cherch");
        person2.test();
        unknown.test();
        String s = "hello";
        Printable print = (String text) -> System.out.println(text);
        print.print(s);
        Interface sum = (double d1, double d2) -> d1 + d2;
        System.out.println(sum.getDouble(5, 6.6));
        Interface pow = (double d1, double d2) -> Math.pow(d1, d2);
        System.out.println(pow.getDouble(5, 2));
        Interface multi = (double d1, double d2) -> d1 * d2;
        System.out.println(pow.getDouble(5, 0.2));


        List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) list.add("elem" + i);
        StringG stringG = (List<String> list1) -> {
            for (String g : list
            ) {
                System.out.print(g);
            }
        };
        stringG.printString(list);

    }
}
