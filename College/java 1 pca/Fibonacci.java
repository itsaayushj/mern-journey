import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        // Scanner takes runtime input
        Scanner sc = new Scanner(System.in);

        // Ask how many terms the user wants
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // First two Fibonacci numbers
        int a = 0;
        int b = 1;

        // Print the first number
        System.out.print(a + " ");

        // We already printed the first term,
        // so start counting from the second term
        int count = 1;

        // Continue until we have printed n terms
        while (count < n) {

            // Add the previous two numbers to get the next number
            int c = a + b;

            // Print the next Fibonacci number
            System.out.print(c + " ");

            // Move b into a
            // Example: a=0, b=1 → a becomes 1
            a = b;

            // Move c into b
            // Example: a=0, b=1, c=1 → b becomes 1
            b = c;

            // One more term has been printed
            count = count + 1;
        }

        // Close Scanner
        sc.close();
    }
}