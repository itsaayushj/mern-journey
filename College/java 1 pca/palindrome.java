import java.util.Scanner;
public class palindrome{
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number:");
        int n = sc.nextInt();
        int original = n; // loop will destory n so storing it for future comparision 

        int i = 0;
        int reverse = 0;
        while (n > 0) {
            i = n % 10 ; // extracting the last digit
            reverse = reverse * 10 + i; // adding the last digit 
            n = n/ 10; // removing the 2 digit 
        } 
        if (original == reverse) { 
            System.out.print(original + "is palindrome ");
        }
        else {
            System.out.print(original + "is not a palindrome");
        }

        sc.close();
    }
}