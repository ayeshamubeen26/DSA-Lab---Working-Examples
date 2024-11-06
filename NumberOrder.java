import java.util.Scanner;

public class NumberOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Checking the order
        String result = checkOrder(num1, num2, num3);
        System.out.println(result);

        scanner.close();
    }

    public static String checkOrder(int num1, int num2, int num3) {
        if (num1 < num2 && num2 < num3) {
            return "increasing";
        } else if (num1 > num2 && num2 > num3) {
            return "decreasing";
        } else {
            return "Neither increasing nor decreasing order";
        }
    }
}
