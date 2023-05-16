
/*
Exp Obj.
 * For example, suppose we have a class called Car that defines the properties and 
 * behaviors of a car. We can create multiple objects of this class, each representing 
 * a unique instance of a car with its own specific state and behavior.
 */



public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Starting the engine...");
    }

    public void stopEngine() {
        System.out.println("Stopping the engine...");
    }
    
    // Create an object of the Car class
    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota", "Corolla", 2022);
        System.out.println(myCar.make+" "+myCar.model+" "+myCar.year);
    }
}
