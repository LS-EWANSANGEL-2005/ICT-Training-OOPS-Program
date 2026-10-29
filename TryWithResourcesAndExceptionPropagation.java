
package OOPSjava;

class MyResource implements AutoCloseable {

    MyResource() {
        System.out.println("Resource opened");
    }

    @Override
    public void close() {
        System.out.println("Resource closed");
    }
}

public class TryWithResourcesAndExceptionPropagation {

    static void method3() throws Exception {
        System.out.println("Inside method3");
        throw new Exception("Exception from method3");
    }

    static void method2() throws Exception {
        System.out.println("Inside method2");
        method3();
    }

    static void method1() throws Exception {
        System.out.println("Inside method1");
        method2();
    }

    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            method1();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("Program complete");
    }
}
