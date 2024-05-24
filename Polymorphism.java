class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Animal{
    public void animalSound() {
        System.out.println("The pig says: oink oink");
    }
}
class Dog extends Animal{
     public void animalSound() {
        System.out.println("The dog says: bow bow");
     }
}
public class Polymorphism {
    public static void main(String[] args) {

        //olymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance
        //Inheritance lets us inherit attributes and methods from another class
        //Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways

        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myPig = new Pig(); // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
