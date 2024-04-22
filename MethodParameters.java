public class MethodParameters {

    //Information can be passed to methods as parameter. Parameters act as variables inside the method
    //Parameters are specified after the method name, inside the parentheses
    //You can add as many parameters as you want, just separate them with a comma

    static void method1(String firstName){
        System.out.println("Hello" + firstName);
    }
    static void method2(String firstName , int age){
        System.out.println(firstName + " is " + age);
    }

    //Return Values
    //The void keyword indicates that the method should not return a value.
    //If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void,
    //and use the return keyword inside the method

    static int method3(int x){
        return x + 5;
    }

    public static void main(String[] args) {

        method1("John");

        //When a parameter is passed to the method, it is called an argument
        //So, from the example above: firstName is a parameter, while John is a arguments

        method2("John", 12);

        int y = method3(12);
        System.out.println(y);

    }
}
