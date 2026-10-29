
package OOPSjava;

public class MultipleCatchAndMultiCatch {

    public static void main(String[] args) {

        try {
            int[] arr = {10, 20};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }
        catch (NullPointerException e) {
            System.out.println("Null value error");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }

        // Multi-catch block
        try {
            String value = null;
            System.out.println(value.length());
        }
        catch (NullPointerException |
               NumberFormatException |
               ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception handled: "
                    + e.getClass().getSimpleName());
        }
    }
}
