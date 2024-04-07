public class NumbersAndStrings {
    public static void main(String[] args) {
        //Java uses the + operator for both addition and concatenation.
        //Numbers are added. Strings are concatenated

        //If you add two numbers, the result will be a number
        int x = 10;
        int y = 25;
        System.out.println(x + y); //output 35

        //If you add two strings, the result will be a string concatenation
        String a = "10";
        String b = "25";
        System.out.println(a + b); //output 1025

        //If you add a number and a string, the result will be a string concatenation:
        System.out.println( x + b); //output 1025 (string)




    }
}
