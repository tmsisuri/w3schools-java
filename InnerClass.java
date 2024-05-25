class A {
    int x = 10;
    
    class B {
        int y = 5;
        public void show() {
            System.out.println("in B show");
        }
    }
    
    static class C {
        int z = 7;
        public void config() {
            System.out.println("in C config");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {

        //To access the inner class, create an object of the outer class, and then create an object of the inner class
        //Unlike a "regular" class, an inner class can be private or protected.
        //If you don't want outside objects to access the inner class, declare the class as private

        A obj1 = new A();
        A.B obj2 = obj1.new B();
        System.out.println(obj2.y + obj1.x);

        //An inner class can also be static, which means that you can access it without creating an object of the outer class
        //just like static attributes and methods, a static inner class does not have access to members of the outer class
        A.C obj3 = new A.C();
        System.out.println(obj3.z);

        //One advantage of inner classes, is that they can access attributes and methods of the outer class
        obj2.show();
        obj3.config();

    }
}
