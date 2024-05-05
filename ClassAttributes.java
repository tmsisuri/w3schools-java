class Main {
    int x;
    int y = 7;
    final int z = 45;
}
public class ClassAttributes {
    public static void main(String[] args) {
        //class attributes are variables within a class
        //Another term for class attributes is fields

        Main obj = new Main();
        System.out.println(obj.y);

        //modify attribute values
        obj.x = 15;
        System.out.println(obj.x);

        //override existing values
        obj.y = 35;
        System.out.println(obj.y);

        //If you don't want the ability to override existing values, declare the attribute as final
        //The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...)
        //The final keyword is called a "modifier"
        System.out.println(obj.z);
    }
}
