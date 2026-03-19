package org.example;

import java.util.List;

public class Tirgul2 {

    abstract static class Vehicle {
        private String licensePlate;
        private String make;
        private String model;
        protected double rentalPrice;


        public String getLicensePlate() {
            return licensePlate;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;

        }

        public double getRentalPrice() {
            return rentalPrice;

        }

        abstract double calculateRentalCost(int days);


    }

    static class Car extends Vehicle {
        private String type;

        public String getType() {
            return type;
        }

        @Override
        double calculateRentalCost(int days) {
            return rentalPrice * days;
        }
    }

    static class Truck extends Vehicle {
        private int capacity;

        public int getCapacity() {
            return capacity;
        }

        @Override
        double calculateRentalCost(int days) {
            return (rentalPrice * days) + capacity;

        }
    }

    public interface Customer {

        String getName();

        void rentVehicle(Vehicle vehicle, int days);

        List<Vehicle> getRentedVehicles();


    }

    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();

        car.rentalPrice = 100;
        truck.rentalPrice = 200;
        truck.capacity = 50;

        System.out.println("השכרת מכונית עבור 3 ימים: " + car.calculateRentalCost(3));
        System.out.println("השכרת משאית עבור 3 ימים: " + truck.calculateRentalCost(3));


    }

}
