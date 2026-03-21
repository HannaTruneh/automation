package org.example;

import java.util.ArrayList;
import java.util.List;

public class VehicleRental {

    public static abstract class Vehicle {
        private String licensePlate;
        private String make;
        private String model;
        protected double rentalPrice;


        public Vehicle(String licensePlate, String make, String model, double rentalPrice) {
            this.licensePlate = licensePlate;
            this.make = make;
            this.model = model;
            this.rentalPrice = rentalPrice;
        }


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

    public static class Car extends Vehicle {

        public Car(String licensePlate, String make, String model, String type, double rentalPrice) {
            super(licensePlate, make, model, rentalPrice);
            this.type = type;
        }

        private String type;

        public String getType() {
            return type;
        }

        @Override
        double calculateRentalCost(int days) {
            return rentalPrice * days;
        }
    }

    public static class Truck extends Vehicle {
        public int capacity;

        public int getCapacity() {
            return capacity;
        }

        public Truck(String licensePlate, String make, String model, int capacity, double rentalPrice) {
            super(licensePlate, make, model, rentalPrice);
            this.capacity = capacity;
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


    public static class RegularCustomer implements Customer {
        private String name;
        private List<Vehicle> rentedVehicles = new ArrayList<>();

        public RegularCustomer(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void rentVehicle(Vehicle vehicle, int days) {
            rentedVehicles.add(vehicle);
        }

        @Override
        public List<Vehicle> getRentedVehicles() {
            return rentedVehicles;
        }
    }

    public static class CorporateCustomer implements Customer {
        private String name;
        private String companyName;
        private List<Vehicle> rentedVehicles = new ArrayList<>();

        public CorporateCustomer(String name, String companyName) {
            this.name = name;
            this.companyName = companyName;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void rentVehicle(Vehicle vehicle, int days) {
            rentedVehicles.add(vehicle);
        }

        @Override
        public List<Vehicle> getRentedVehicles() {
            return rentedVehicles;
        }
    }

    public static void main(String[] args) {

        // יצירת רכבים ולקוחות
        Car car = new Car("123-45-678", "Toyota", "Corolla", "Sedan", 100);
        Truck truck = new Truck("987-65-432", "Volvo", "FH", 50, 200);
        Customer customer = new RegularCustomer("יוסי");
        Customer corporateCustomer = new CorporateCustomer("דנה", "כלל");

        // השכרת רכבים ללקוחות
        customer.rentVehicle(car, 3);
        customer.rentVehicle(truck, 5);

       //שימוש ברשימה כדי לשמור את הרכבים   שהושכרו
        List<Vehicle> rented = customer.getRentedVehicles();


        System.out.println("רשימת רכבים מושכרים: ");
        for (Vehicle v : rented) {
            System.out.println("רכב: " + v.getClass().getSimpleName());
            System.out.println("לוחית רישוי:  " + v.getLicensePlate());
            System.out.println("יצרן: " + v.getMake());
            System.out.println("דגם: " + v.getModel());
            System.out.println("מחיר שכירות ליום: " + v.getRentalPrice());
        }
        System.out.println("מחירון:");
        System.out.println("מחיר השכרת מכונית  ליום: " + car.calculateRentalCost(1) + " שח");
        System.out.println("מחיר השכרת משאית ליום:  " + truck.calculateRentalCost(1) + " שח");

    }
}