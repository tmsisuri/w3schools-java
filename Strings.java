public class Strings {
    public static void main(String[] args) {
        //Strings are used for storing text
        //A String variable contains a collection of characters surrounded by double quotes

        String greeting = "Hello";
        System.out.println(greeting);
        
        //String Length
        //A String in Java is actually an object, which contain methods that can perform certain operations on strings
        //For example, the length of a string can be found with the length() method

        String txt = "ashaosiajlJSLShausauasqfqusk";
        System.out.println("the length of the txt string is" + txt.length());

        String str = "Hello World";
        System.out.println(str.toUpperCase()); //outputs HELLO WORLD
        System.out.println(str.toLowerCase()); //outputs hello world

        //Finding a Character in a String
        //The indexOf() method returns the index(the position) of the first occurrence of a specified text in a string (including whitespace)
        //Java counts positions from zero.
        //0 is the first position in a string, 1 is the second, 2 is the third ...
        
        String str1 = "Please locate where 'locate' occurs!";
        System.out.println(str1.indexOf("locate")); //outputs 7
    }
}
