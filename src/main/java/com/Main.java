package com;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        //Task 1
        Factorial<Integer> factorial=(Integer n)->{
            int getNum=1;
            for(int i=1;i<=n;i++)
                getNum*=i;
            return getNum;
        };
        System.out.println(factorial.factorial(5));

        //Task 2
        Mathematics<Double> mathematics=(Double root,Double num) ->{
           return Math.pow(num,1.0/root);
        };
        System.out.println(mathematics.getRoot(4.0,81.0));

    }
}
