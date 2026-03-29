package Conditionals;
import java.util.Scanner;

public class Fibonnaci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Terms(1 to n): ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonnaci Series for given terms: ");

        if(n == 1){
            System.out.print(a + " ");
        }
        else if(n == 2){
            System.out.print(a + " " + b + " ");
        }
        else{
            System.out.print(a + " " + b + " ");
            for(int i=2;i<n;i++){
                int next = a + b;
                a = b;
                b = next;
                System.out.print(next + " ");
            }
        }

        sc.close();
    }
}
