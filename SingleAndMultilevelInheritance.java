
package OOPSjava;

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Vehicle constructor");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
        System.out.println("Car constructor");
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int speed, int doors,
                int batteryCapacity) {
        super(brand, speed, doors);
        this.batteryCapacity = batteryCapacity;
        System.out.println("ElectricCar constructor");
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Doors: " + doors);
        System.out.println("Battery Capacity: "
                + batteryCapacity + " kWh");
    }
}

public class SingleAndMultilevelInheritance {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar("Tesla", 180, 4, 75);
        e.display();
    }
}

