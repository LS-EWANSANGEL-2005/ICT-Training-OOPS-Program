
package OOPSjava;

public class AccessModifierDemonstration {

    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;

    public void display() {
        System.out.println("Private: " + a);
        System.out.println("Default: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Public: " + d);
    }

    public static void main(String[] args) {
        AccessModifierDemonstration obj =
                new AccessModifierDemonstration();

        obj.display();
    }
}

