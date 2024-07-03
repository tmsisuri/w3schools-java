public class StringToArray {
    public static void main(String[] args) {
        String str = "Hello";

        //to convert a string to an array use the toCharArray() method
        char[] myArray = str.toCharArray();

        for(char c : myArray) {
            System.out.println(c);
        }
    }
}
