abstract class Animal {
    //An abstract class can have both abstract and regular methods

    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says oink oink...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        //Data abstraction is the process of hiding certain details and showing only essential information to the user.
        //Abstraction can be achieved with either abstract classes or interfaces

        //The abstract keyword is a non-access modifier, used for classes and methods
        //Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class)
        //Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from)

        Pig obj1 = new Pig();
        obj1.animalSound();
        obj1.sleep();
    }
}
