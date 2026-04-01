package OOPs;
import java.util.Scanner;

class Employee {
    double salary = 50000;
    void work() { 
        System.out.println("Working hard!"); 
    }
}

class Manager extends Employee {
    double bonus = 10000;
    
    void work() {
        super.work(); // Calls Employee's work()
        System.out.println("Managing team.");
    }
    void printCompensation() {
        // Accessing parent variable using super (optional if not hidden)
        System.out.println("Total: " + (super.salary + bonus)); 
    }
}

public class Inheritance_and_super {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager m1 = new Manager();
        System.out.println(m1);
        m1.work();
        m1.printCompensation();

        sc.close();
    }
}
