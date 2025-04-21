package org.example;

public class Motor {
    Motor()
    {
        System.out.println("motor cons....");
    }

    public void start(){
        System.out.println("motor started....");
    }

    public void doWork()
    {
        System.out.println("Motor pulling water...");
    }

    public void stop()
    {
        System.out.println("Motor stopped...");
    }
}
