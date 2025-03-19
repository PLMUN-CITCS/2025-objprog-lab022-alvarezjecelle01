// Car class to represent a car with attributes and methods
class Car {
    // Attributes (instance variables)
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class to demonstrate object instantiation and method usage
public class CarDemo {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();
        
        // Assign values to the attributes of the myCar object
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;
        
        // Call the displayInfo method to print the car's details
        myCar.displayInfo();
    }
}
