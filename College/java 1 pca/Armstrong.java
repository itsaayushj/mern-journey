import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        // Scanner is used to take input from the user at runtime
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        // Store the original number because we will change n inside the loop
        int original = n;

        // This will store the sum of the cubes of all digits
        int sum = 0;

        // Repeat until all digits of n have been processed
        while (n > 0) {

            // % 10 extracts the last digit
            // Example: 153 % 10 = 3
            int digit = n % 10;

            // Cube the digit and add it to sum
            // Example: 3 * 3 * 3 = 27
            sum = sum + (digit * digit * digit);

            // / 10 removes the last digit
            // Example: 153 / 10 = 15
            n = n / 10;
        }

        // If the sum of cubes equals the original number,
        // then it is an Armstrong number
        if (original == sum) {

            System.out.print(original + " is an Armstrong number");

        } else {

            System.out.print(original + " is not an Armstrong number");
        }

        // Close the Scanner
        sc.close();
    }
}




// main part
// while (n > 0) {

//     int digit = n % 10;        // extract last digit

//     sum = sum + digit * digit * digit;  // cube + add

//     n = n / 10;                // remove last digit
// }