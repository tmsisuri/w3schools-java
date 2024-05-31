import java.util.ArrayList;

public class ArrayListForNumbers {
    public static void main(String[] args) {
        //Elements in an ArrayList are actually objects
        //Remember that a String in Java is an object (not a primitive type)
        //To use other types, such as int, you must specify an equivalent wrapper class: Integer
        //For other primitive types, use: Boolean for boolean, Character for char, Double for double

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        System.out.println(numbers);
        for(int i : numbers) {
            System.out.println(i);
        }
    }
}
