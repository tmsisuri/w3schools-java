interface FirstInterface {
    public void myFirstMethod();
}

interface SecondInterface {
    public void mySecondMethod();
}

class Demo implements FirstInterface, SecondInterface {

    public void myFirstMethod() {
        System.out.println("in my first method...");
    }

    public void mySecondMethod() {
        System.out.println("in my second method...");
    }
    
}
public class MultipleInterfaces {
    public static void main(String[] args) {
        //Java does not support "multiple inheritance" (a class can only inherit from one superclass). 
        //However, it can be achieved with interfaces, because the class can implement multiple interfaces
        //To implement multiple interfaces, separate them with a comma

        Demo obj = new Demo();
        obj.myFirstMethod();
        obj.mySecondMethod();
    }
}
