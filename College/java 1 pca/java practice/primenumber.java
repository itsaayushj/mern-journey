import java.util.Scanner;
public class primenumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int n = sc.nextInt();
        boolean isprime = true;
        if (n <= 1){
            isprime = false;
        } else {
            for (int i = 2; i < n; i++){
                if (n % i == 0){
                    isprime = false;
                    break;
                }

            }
        }
        if (isprime){
            System.out.print("Prime number");

        } else {
            System.out.print("Not a prime number");
        }
        sc.close();
    }
}