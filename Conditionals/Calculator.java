package Conditionals;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the operator: ");
        char ch = sc.next().trim().charAt(0);

        int num1 = 0, num2 = 0;

        if(ch == '+' || ch == '-' || ch == '*' || ch == '%' || ch == '/'){
            System.out.print("Enter the operands: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }

        int result = 0;

        if(ch == '+'){
             result += num1 + num2;
        } 
        else if(ch == '-'){
            result += num1 - num2;
        }
        else if(ch == '*'){
            result += num1 * num2;
        }
        else if(ch == '/'){
            result += num1 / num2;
        }
        else if(ch == '%'){
            result += num1 % num2;
        }
        else {
            System.out.print("Invalid Input!\n");
        }

        System.out.print("\nResult : " + result);

        sc.close();
    }
}
