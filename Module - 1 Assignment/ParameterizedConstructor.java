
// Initializing class fields using a parameterized constructor
class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Car Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car c = new Car("Toyota", 2020);
        c.display();
    }
}
