public class Modifiers {
    public static void main(String[] args) {
        //The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors

        //Access Modifiers     -  controls the access level
        //Non-Access Modifiers -  do not control access level, but provides other functionality

        //Access Modifiers

        //For classes ---> public or default

        // Modifier	       Description	
        // public	       The class is accessible by any other class	
        // default	       The class is only accessible by classes in the same package. This is used when you don't specify a modifier

        // For attributes, methods and constructors

        // Modifier	       Description	
        // public	       The code is accessible for all classes	
        // private	       The code is only accessible within the declared class	
        // default	       The code is only accessible in the same package. This is used when you don't specify a modifier
        // protected       The code is accessible in the same package and subclasses. 	

        // Non-Access Modifiers

        // For classes ---> final or abstract

        // Modifier	       Description	
        // final	       The class cannot be inherited by other classes 
        // abstract	       The class cannot be used to create objects (To access an abstract class, it must be inherited from another class)	
      
        // For attributes and methods

        // Modifier	       Description
        // final	       Attributes and methods cannot be overridden/modified
        // static	       Attributes and methods belongs to the class, rather than an object
        // abstract	       Can only be used in an abstract class, and can only be used on methods. The method does not have a body. The body is provided by the subclass
        // transient	   Attributes and methods are skipped when serializing the object containing them
        // synchronized	   Methods can only be accessed by one thread at a time
        // volatile	       The value of an attribute is not cached thread-locally, and is always read from the "main memory"

    }
}
