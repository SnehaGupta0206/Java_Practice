import java.util.*;
public class Conditional{
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a<c || a<b && a>c){
            System.out.printf("The Middle number is : %d",a);
        }
        else if(b>a && b<c || b<a && b>c){
            System.out.printf("The Middle number is : %d",b);
        }
        else{
            System.out.printf("The Middle number is : %d",c);
        }

        sc.close();
    }
}