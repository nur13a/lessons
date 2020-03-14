package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] num = {1, 2, 3};
        Stream.of(num).forEach(x -> System.out.println(x * x));
        List<String> string = new ArrayList<>();
        string.add("a");
        string.add("b");
        string.add("c");
        string.add("d");
        string.stream().forEach(x -> System.out.println(x.replace("a", "o")));

        Stream.of(num).map(x -> x * 2).forEach(x -> System.out.println(x));
//get number
        Integer[] array = {100, 200, 300};
        Stream.of(array).map(x -> x * 0.1).forEach(x -> System.out.println(x));
        List<String> arrays = new ArrayList<>();
        arrays.add("name");
        arrays.add("gender");
        arrays.stream().map(x -> x + x).forEach(x -> System.out.println(x));

        //get Student without id
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Aziret"));
        students.add(new Student(2, "Aziret2"));
        students.stream().map(x -> x.name).forEach(x -> System.out.println(x));
        List<Integer> integers = Stream.of(num).collect(Collectors.toList());
        System.out.println(integers);
        integers.stream().map(x -> x % 3 == 0 ? x * 0 : x * 10).forEach(x -> System.out.println(x));
        //get Students who has mark 4 or 5
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student(1, "Aziret", 5));
        students1.add(new Student(2, "Aziret2", 2));
        students1.add(new Student(2, "Aziret3", 4));
        students1.stream().filter(x -> x.mark >= 4).collect(Collectors.toList());
    //    Optional<Student>stud=students1.stream().max((s1, s2) ->);
        System.out.println(students1);
        int count = (int) students1.stream().filter(x -> x.mark == 2).count();
        System.out.println(count);


        List<String> stringList=new ArrayList<>();
        stringList.add("first");
        stringList.add("second");
        stringList.add("third");
        Stream<String>stream=stringList.stream();
        Optional<String>reduced=stream.reduce((value,combined)->{return value+" " +combined;});
        System.out.println(reduced.get());
    }
}
