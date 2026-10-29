
package OOPSjava;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverloadingVsOverriding {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Integer addition: " + c.add(10, 20));
        System.out.println("Double addition: " + c.add(2.5, 3.5));
        System.out.println("Three numbers: " + c.add(10, 20, 30));

        Animal a = new Dog();
        a.sound();
    }
}
