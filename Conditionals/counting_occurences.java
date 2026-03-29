package Conditionals;
import java.util.Scanner;

public class counting_occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        System.out.print("Enter the number whose occurence needs to be calculated: ");
        int num = sc.nextInt();

        int count = 0;
        
        while(n!=0){
            int rem = n%10;
            if(rem == num){
                count++;
            }
            n/=10;
        }

        System.out.print("The given number " + num + " occurs " + count + " times in the integer.");

        sc.close();
    }
}
