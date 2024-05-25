enum Level {
    //To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters
    LOW,
    MEDIUM,
    HIGH
}
public class Enum {
    public static void main(String[] args) {
        //An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables)
        //constant is a variable whose value cannot be changed once it's assigned
        //Enum is short for "enumerations", which means "specifically listed"

        //You can access enum constants with the dot syntax

        Level myLevel = Level.MEDIUM;
        System.out.println(myLevel);

        //You can also have an enum inside a class

        //Enum in a Switch Statement

        switch(myLevel) {
            case LOW :
               System.out.println("Low level");
               break;
            case MEDIUM :
               System.out.println("Medium level");
               break;
            case HIGH :
               System.out.println("High level");
               break;
        }

        //Loop Through an Enum

        //The enum type has a values() method, which returns an array of all enum constants
        //This method is useful when you want to loop through the constants of an enum

        for(Level myVar : Level.values()) {
            System.out.println(myVar);
        }

        //Difference between Enums and Classes
        //An enum can, just like a class, have attributes and methods
        //The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden)
        //An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces)
    }
}
