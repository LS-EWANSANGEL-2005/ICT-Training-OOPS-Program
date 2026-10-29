
package OOPSjava;

public class SamePackage {

    public static void main(String[] args) {
        AccessModifierDemonstration obj =
                new AccessModifierDemonstration();

        System.out.println("Default: " + obj.b);
        System.out.println("Protected: " + obj.c);
        System.out.println("Public: " + obj.d);
    }
}
