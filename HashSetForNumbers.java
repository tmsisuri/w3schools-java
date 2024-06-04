import java.util.HashSet;

public class HashSetForNumbers {
    public static void main(String[] args) {
        //Items in an HashSet are actually objects
        //Remember that a String in Java is an object (not a primitive type). 
        //To use other types, such as int, you must specify an equivalent wrapper class: Integer
        //For other primitive types, use: Boolean for boolean, Character for char, Double for double

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(11);
        numbers.add(3);
        numbers.add(18);
        numbers.add(21);
        numbers.add(2);
        numbers.add(54);
        numbers.add(7);
        numbers.add(5);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i=0 ; i<=10 ; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set");
            }
            else {
                System.out.println(i + " was not found in the set");
            }
        }

        //print numbers between 1 and 20 are in the set
        for(int j=0 ; j<=20 ; j++) {
            if(numbers.contains(j)) {
                System.out.println(j);
            }
            else {
                continue;
            }
        }

    }
}
