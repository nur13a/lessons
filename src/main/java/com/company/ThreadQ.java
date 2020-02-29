package com.company;

public class ThreadQ extends Thread {
    String[] people;

    public ThreadQ(String[] people) {
        this.people = people;
    }

    @Override
    public void run() {
        for (String i : people) {
            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
