package org.example;

public class PetrolEngine implements Engine{

PetrolEngine(){
    System.out.println("PetrolEngine const....");
}
    public int start(){
        System.out.println("Petrol Engine Staart...");
        return 1;
    }
}
