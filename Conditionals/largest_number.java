package Conditionals;
import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a + " is Largest number.");
        }else if(b>c && b>a){
            System.out.println(b + " is Largest number.");
        }else{
            System.out.println(c + " is Largest number.");
        }

        sc.close();
    }
}
