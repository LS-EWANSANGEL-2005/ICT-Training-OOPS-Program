
package OOPSjava;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatchFinallyBasics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter two integers: ");

            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (InputMismatchException e) {
            System.out.println("Enter integers only");
        }
        finally {
            System.out.println("Operation complete");
            sc.close();
        }
    }
}


