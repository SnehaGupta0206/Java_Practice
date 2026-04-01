package OOPs;

class Animal {
    void sound() { 
        System.out.println("Generic animal sound"); 
    }
}
class Cat extends Animal {
    @Override
    void sound() { 
        System.out.println("Meow"); 
    }
    void purr() { 
        System.out.println("Purring..."); 
    }
}

public class Polymorphism_instanceof {
    public static void main(String[] args) {
        Animal myPet = new Cat(); // Upcasting
        myPet.sound(); // Polymorphism: Prints "Meow", not generic sound.
        
        // myPet.purr(); -> Compile Error! Animal reference doesn't know about purr.
        
        if (myPet instanceof Cat) { // Safety check
            Cat realCat = (Cat) myPet; // Downcasting
            realCat.purr(); // Now it works!
        }
    }
}
