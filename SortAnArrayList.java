import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayList {
    public static void main(String[] args) {
        //Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically

        //Sort an ArrayList of Strings
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);
        System.out.println(cars);
        for(String i : cars) {
            System.out.println(i);
        }

        //Sort an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(33);
        numbers.add(42);
        numbers.add(12);
        numbers.add(123);
        numbers.add(2);
        numbers.add(21);
        numbers.add(15);
        numbers.add(4);

        Collections.sort(numbers);
        for(int j : numbers) {
            System.out.println(j);
        }

    }
}
