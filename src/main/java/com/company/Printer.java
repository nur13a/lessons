package com.company;

public class Printer extends Thread  {
    String name;
    int count;
public Printer (String name,int count){
    this.name=name;
    this.count=count;
}
    @Override
    public synchronized void run() {
        try {
            App.print(name,count);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
