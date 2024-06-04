import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {
        //An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet
        //It is called an "iterator" because "iterating" is the technical term for looping

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //The iterator() method can be used to get an Iterator for any collection
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());
        
        //Looping through a collection
        //To loop through a collection, use the hasNext() and next() methods of the Iterator
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
