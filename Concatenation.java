public class Concatenation {
    public static void main(String[] args) {
        //The + operator can be used between strings to combine them. This is called concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        //You can also use the concat() method to concatenate two strings
        System.out.println(firstName.concat(" " + lastName));
    }
}
