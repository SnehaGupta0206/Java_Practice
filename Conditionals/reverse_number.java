package Conditionals;
import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer to reverse: ");
        int n = sc.nextInt();

        int rev = 0;
        while(n != 0){
            int rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        System.out.print("The reversed number of given number is " + rev);

        sc.close();
    }
}
