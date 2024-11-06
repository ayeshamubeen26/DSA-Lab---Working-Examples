import java.util.Scanner;

public class CompareFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading two floating-point numbers
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();

        // Comparing up to three decimal places
        if (areEqualUpToThreeDecimalPlaces(num1, num2)) {
            System.out.println("The entered numbers are the same up to 3 decimal places.");
        } else {
            System.out.println("The entered numbers are different.");
        }

        scanner.close();
    }

    public static boolean areEqualUpToThreeDecimalPlaces(double num1, double num2) {
        // Multiplying by 1000 and casting to int to ignore decimal beyond three places
        int scaledNum1 = (int) (num1 * 1000);
        int scaledNum2 = (int) (num2 * 1000);

        return scaledNum1 == scaledNum2;
    }
}
