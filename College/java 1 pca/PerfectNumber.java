import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        // Scanner takes runtime input
        Scanner sc = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        // This will store the sum of the proper divisors
        int sum = 0;

        // Check every number from 1 up to n-1
        for (int i = 1; i < n; i++) {

            // If n is exactly divisible by i,
            // then i is a divisor of n
            if (n % i == 0) {

                // Add the divisor to our sum
                sum = sum + i;
            }
        }

        // If the sum of divisors equals the original number,
        // it is a Perfect Number
        if (sum == n) {

            System.out.print(n + " is a Perfect Number");

        } else {

            System.out.print(n + " is not a Perfect Number");
        }

        // Close Scanner
        sc.close();
    }
}

// i = 1 → 6 % 1 = 0 → sum = 1
// i = 2 → 6 % 2 = 0 → sum = 3
// i = 3 → 6 % 3 = 0 → sum = 6
// i = 4 → not divisor
// i = 5 → not divisor

// sum == n
// 6 == 6
// → Perfect Number