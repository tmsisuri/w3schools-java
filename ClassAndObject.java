class Object {
    int x = 17;
}
public class ClassAndObject {
    public static void main(String[] args) {
        //Java is an object-oriented programming language
        //Everything in Java is associated with classes and objects, along with its attributes and methods
        //A Class is like an object constructor, or a "blueprint" for creating objects
        //class should always start with an uppercase first letter, and that the name of the java file should match the class name

        //You can also create an object of a class and access it in another class
        //This is often used for better organization of classes 
        //One class has all the attributes and methods, while the other class holds the main() method (code to be executed)

        Object myobj = new Object();
        System.out.println(myobj.x);
    }
}
