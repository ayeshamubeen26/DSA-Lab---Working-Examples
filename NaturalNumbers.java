import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NaturalNumbers {
    public static void main(String[] args) {
        int sum, n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        sum = 0;

        for (i = 1; i <= n; i++) {
            sum += i;
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
            sc.close();
        }
    }
}
