
// Implementing Abstraction using Interfaces
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with a kick");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        myVehicle.start();

        myVehicle = new Bike();
        myVehicle.start();
    }
}
