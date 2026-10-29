
package OOPSjava;

interface Flyable {
    void fly();

    default void action() {
        System.out.println("Duck can fly");
    }
}

interface Swimmable {
    void swim();

    default void action() {
        System.out.println("Duck can swim");
    }
}

class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void action() {
        Flyable.super.action();
        Swimmable.super.action();
        System.out.println("Duck can fly and swim");
    }
}

public class InterfaceAndMultipleInheritance {

    public static void main(String[] args) {
        Duck d = new Duck();

        d.fly();
        d.swim();
        d.action();
    }
}
