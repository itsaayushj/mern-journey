import java.util.Scanner;

public class primenumber {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();  // takes the next int user enters which we entered above
        boolean prime = true; // just set prime as a boolean type. ts aint too deep 
        if (n <=1) {
            prime = false;
        } else {
            for (int i = 2; i < n; i++ ) {  // notice a semi colon on every argument 
                if (n %  i == 0 ) { 
                    prime = false;
                    break;
                }
            }
        }
        if (prime) { 
            System.out.print(n + " is a Prime number");
        }
        else {
            System.out.print(n + "is not a prime number");
        }
        sc.close(); 
    }
}