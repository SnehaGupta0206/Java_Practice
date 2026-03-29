package Conditionals;
import java.util.Scanner;

public class Alphabet_case_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // trim is used to remove extra spaces
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("The First Character of string is in Lower Case.");
        }else{
            System.out.println("The First Character of string is in Upper Case.");
        }

        sc.close();
    }
}
