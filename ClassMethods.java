public class ClassMethods {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args) {

        //static method can be accessed without creating an object of the class, unlike public, which can only be accessed by objects
        myStaticMethod();

        ClassMethods obj = new ClassMethods();
        obj.myPublicMethod();
    }
}
