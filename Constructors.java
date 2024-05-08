class Cars {
    int price;
    String colour;

    public Cars() {
        price = 200;
    }

    public Cars(String c) {
        c = colour;
        price = 200;
    }
}

public class Constructors {
    public static void main(String[] args) {
        //A constructor in Java is a special method that is used to initialize objects
        //The constructor is called when an object of a class is created
        //It can be used to set initial values for object attributes

        Cars obj1 = new Cars();
        System.out.println(obj1.price);

       //The constructor name must match the class name, and it cannot have a return type (like void)
       //The constructor is called when the object is created
       //All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you
       //However, then you are not able to set initial values for object attributes

       Cars obj2 = new Cars("Black");
       System.out.println(obj2.price + obj2.colour);
    }
}
