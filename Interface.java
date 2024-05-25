interface Animal {
    public void animalSound();
    public void sleep();
}
class Pig implements Animal {
    //To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword
    //The body of the interface method is provided by the "implement" class

    public void animalSound() {
        System.out.println("The pig says: oink oink");
    }

    public void sleep() {
        System.out.println("Zzz...");
    }
}
public class Interface {
    public static void main(String[] args) {
        //An interface is a completely "abstract class" that is used to group related methods with empty bodies
        Pig obj1 = new Pig();
        obj1.animalSound();
        obj1.sleep();

        //Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
        //Interface methods do not have a body - the body is provided by the "implement" class
        //On implementation of an interface, you must override all of its methods
        //Interface methods are by default abstract and public
        //Interface attributes are by default public, static and final
        //An interface cannot contain a constructor (as it cannot be used to create objects)
    }
}
