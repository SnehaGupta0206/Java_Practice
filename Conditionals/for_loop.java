package Conditionals;
import java.util.*;
public class for_loop{ //class definition
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.length());
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));//use println to get the output in new line after printing one output and print to get same input
        }
        sc.close();
    }
}