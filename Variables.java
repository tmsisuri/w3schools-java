public class Variables {
    public static void main(String[] args) {
        //String - stores text, such as "Hello". String values are surrounded by double quotes
        //int - stores integers (whole numbers), without decimals, such as 123 or -123
        //float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        //char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        //boolean - stores values with two states: true or false

        String name = "john";
        System.out.println(name);

        int myNum1 = 15;
        System.out.println(myNum1);

        //declare a variable without assigning the value, and assign the value
        int myNum2;
        myNum2 = 12;
        System.out.println(myNum2);

        //assign a new value to an existing variable, it will overwrite the previous value
        int myNum3 = 34;
        myNum3 = 54;
        System.out.println(myNum3);

        //final variable
        //final keyword will declare the variable as "final" or "constant", which means unchangeable and read-only
        final int myNum4 = 23;
        System.out.println(myNum4);

        int x = 5;
        float f = 3.4f;
        char c = 'k';
        boolean bool = true;
        String text = "hello";
        System.out.println(x);
        System.out.println(f);
        System.out.println(c);
        System.out.println(bool);
        System.out.println(text);
    }
}
