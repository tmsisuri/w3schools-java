public class TypeCasting {
    public static void main(String[] args) {
        // Type casting is when you assign a value of one primitive data type to another type.

        // In Java, there are two types of casting:

        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double

        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte

        // Widening casting
        // Widening casting is done automatically when passing a smaller size type to a larger size type:

        int n1 = 6;
        double d1 = n1;

        System.out.println(n1);
        System.out.println(d1);

        // Narrowing casting
        // Narrowing casting must be done manually by placing the type in parentheses in front of the value
        double d2 = 9.875;
        int n2 = (int) d2;

        System.out.println(d2);
        System.out.println(n2);

        //int to byte

        //When int is assigned to the value between -128 to 127 inclusive, the conversion to the byte of that number will remain the same.
        int x = 115;
        byte b = (byte) x;
        System.out.println(b);
        //If int is less than -128, we just add than number with 256 to convert into byte.
        int x1 = -135;
        byte b1 = (byte) x1;
        System.out.println(b1); //(256 + (-135) = 121)

        //If int ranges between 128 to 256 inclusive, that number will be deducted with 256.
        int x2 = 167;
        byte b2 = (byte) x2;
        System.out.println(b2); //(167 - 256 = -89)

        //if the number is greater than 256, we will divide that number with 256 and tke the reminder
        int x3 = 3876;
        byte b3 = (byte) x3;
        System.out.println(b3); //(3876 % 256 = 36)
    }
}
