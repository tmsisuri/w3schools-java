public class WrapperClass {
    public static void main(String[] args) {
        //Wrapper classes provide a way to use primitive data types as objects

        //   Primitive Data Type	 Wrapper Class
        //         byte     	     Byte
        //         short	         Short
        //         int	             Integer
        //         long	             Long
        //         float	         Float
        //         double	         Double
        //         boolean	         Boolean
        //         char	             Character

        //we must use wrapper classes, when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects)

        //Creating wrapper objects
        //To create a wrapper object, use the wrapper class instead of the primitive type
        //To get the value, you can just print the object

        Integer myInt = 100;
        Double myDouble = 6.57;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        //the following methods are used to get the value associated with the corresponding wrapper object
        //intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue()

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        //Another useful method is the toString() method, which is used to convert wrapper objects to strings
        String myString = myInt.toString();
        System.out.println(myString.length());
    }
}
