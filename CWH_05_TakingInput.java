import java.util.Scanner;

public class CWH_05_TakingInput {
    public CWH_05_TakingInput() {
    }

    public static void main(String[] args) {
        System.out.println("Input taken by the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of the first and second numbers is: " + sum);
    }
}
