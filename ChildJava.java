
package OOPSjava;

public class ChildJava extends AccessModifierDemonstration {

    @Override
    public void display() {
        // System.out.println(a); // Private: Not accessible
        System.out.println("Protected: " + c);
        System.out.println("Public: " + d);
    }

    public static void main(String[] args) {
        ChildJava obj = new ChildJava();
        obj.display();
    }
}
