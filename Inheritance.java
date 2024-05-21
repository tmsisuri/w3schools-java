class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}
class Car extends Vehicle{
    public String modelName = "mustang";
}
public class Inheritance {
    public static void main(String[] args) {
        //In Java, it is possible to inherit attributes and methods from one class to another.
        //We group the "inheritance concept" into two categories
        //subclass (child) - the class that inherits from another class
        //superclass (parent) - the class being inherited from
        //To inherit from a class, use the extends keyword.

        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName );
    }
}
