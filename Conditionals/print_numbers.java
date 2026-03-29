package Conditionals;

import java.util.Scanner;

public class print_numbers {
    public static void main(String[] args) {
        /*
            Syntax of For loop:
                for(intialisation;condition;increment/decrement){
                    //body
                }
            
            Syntax of While loop(Use when we donot know how many times loop will run):
                while(condition){
                    //body
                }
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //Print "Hello World n times"
        for(int i = 1 ; i <= n ; i++){
            System.out.println("Hello World");
        }

        //Print numbers using while loop
        int i = 1;
        while(i<=n){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        /*
            Syntax of Do-while Loop(Loop will execute atleast once):
            -> first execute once then check the condition
            do{
                //body
            }while(condition);
        */
        int j = 1;
        do{
            System.out.print(j + " ");
            j++;
        }while(j<=n);
        System.out.println();

        sc.close();
    }
}
