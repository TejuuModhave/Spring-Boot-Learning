package org.example;

public class Car {


    Engine engine;

    Car()
    {
        System.out.println("car constructor .... ");
    }
    public Car(Engine engine) {
        System.out.println("Car | 1 arg cons ....");
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("Car setter method....");
        this.engine = engine;
    }

    public void drive()
    {
        int res = engine.start();
        {
            if(res >= 1)
            {
                System.out.println("car started with good engine");
            }
            else {
                System.out.println("engine not working");
            }
        }
    }
}
