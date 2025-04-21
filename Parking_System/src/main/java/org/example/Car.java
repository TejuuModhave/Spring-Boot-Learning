package org.example;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String licenseplate;

    public Car(String licenseplate){
        this.licenseplate = licenseplate;
    }

    public String getLicenseplate(){
        return licenseplate;
    }
}


class ParkingSpot {
    private int spotNumber;
    private boolean available;
    private Car car;





    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.available = true;
        this.car = null;
    }
    public int getSpotNumber() {
        return spotNumber;
    }

        public boolean isAvaliable() {
            return available;
        }
        public Car getCar() {
            return car;
        }

        public void occupy(Car car)
            {
                this.car = car;
                this.available = false;
            }

            public void empty() {
                this.car = null;
                this.available = true;
            }



    }
class ParkingLot
{
    private List<ParkingSpot> spots  ;

    public ParkingLot(int capacity)
    {
        this.spots = new ArrayList<>();
        for(int i=0;i<capacity;i++)
        {
            spots.add(new ParkingSpot(i));
        }
    }
}
