public class Numbers {
    public static void main(String[] args) {
        //Primitive number types are divided into two groups:

        //Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals 
        //Valid types are byte, short, int and long. Which type you should use, depends on the numeric value

        //Floating point types represents numbers with a fractional part, containing one or more decimals
        //There are two types: float and double

        //Integer Types
        //byte
        //The byte data type can store whole numbers from -128 to 127. 
        //This can be used instead of other integer types to save memory when you are certain that the value will be within -128 and 127
        byte n1 = 100;
        System.out.println(n1);

        //short
        //The short data type can store whole numbers from -32768 to 32767
        short n2 = 5000;
        System.out.println(n2);

        //int
        //In general int data type is the preferred data type when we create variables with a numeric value.
        int n3 = 100000;
        System.out.println(n3);

        //long
        //This is used when int is not large enough to store the value. Note that you should end the value with an "l"
        long n4 = 15000000000l;
        System.out.println(n4);

        //Floating Point Types
        //You should use a floating point type whenever you need a number with a decimal
        //The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats
        float n5 = 5.432f;
        System.out.println(n5);

        double n6 = 23.4567;
        System.out.println(n6);

        //Scientific Numbers
        //A floating point number can also be a scientific number with an "e" to indicate the power of 10
        float f = 35e3f; //35000
        double d = 12e4d; //120000
        System.out.println(f);
        System.out.println(d);
    }
}
