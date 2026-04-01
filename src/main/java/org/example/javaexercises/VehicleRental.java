package org.example.javaexercises;

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

        @Override
        public String toString() {
            return "לוחית רישוי:  " + licensePlate + "\n" +
                    "יצרן:  " + make + "\n" +
                    "דגם:  " + model + "\n" +
                    "מחיר השכרה ליום:  " + rentalPrice +
                    " שח";
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

        private String type;

        public Car(String licensePlate, String make, String model, String type, double rentalPrice) {
            super(licensePlate, make, model, rentalPrice);
            this.type = type;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return " מכונית\n" +
                    super.toString() + "\n" +
                    "סוג:  " + type;
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
        public String toString() {
            return "משאית\n" +
                    super.toString();
        }

        @Override
        double calculateRentalCost(int days) {
            return (rentalPrice * days) + capacity;
        }
    }

    public static class Rental {
        private Vehicle vehicle;
        private int days;

        public Rental(Vehicle vehicle, int days) {
            this.vehicle = vehicle;
            this.days = days;
        }

        public Vehicle getVehicle() {
            return vehicle;
        }

        public int getDays() {
            return days;
        }

        @Override
        public String toString() {
            return vehicle.toString() + "\n" + "ימים: " + days;
        }
    }

    public interface Customer {

        String getName();

        void rentVehicle(Vehicle vehicle, int days);

        List<Rental> getRentedVehicles();
    }


    public static class RegularCustomer implements Customer {

        private String name;

        private List<Rental> rentedVehicles = new ArrayList<>();

        public RegularCustomer(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void rentVehicle(Vehicle vehicle, int days) {
            rentedVehicles.add(new Rental(vehicle, days));
        }

        @Override
        public List<Rental> getRentedVehicles() {
            return rentedVehicles;
        }
    }

    public static class CorporateCustomer implements Customer {
        private String name;
        private String companyName;
        private List<Rental> rentedVehicles = new ArrayList<>();

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
            // אפשר לחשב הנחה כאן אם רוצים (כרגע שומרים בדיוק כמו רגיל)
            rentedVehicles.add(new Rental(vehicle, days));
        }

        @Override
        public List<Rental> getRentedVehicles() {
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
        List<Rental> rented = customer.getRentedVehicles();


        System.out.println("רשימת רכבים מושכרים: ");
        for (Rental r : rented) {
            System.out.println(r.vehicle);
            System.out.println("עלות השכרה:  " + r.vehicle.calculateRentalCost(r.days));
            System.out.println("---------------------");


        }
    }
}