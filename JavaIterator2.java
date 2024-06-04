import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator2 {
    public static void main(String[] args) {
        //Removing Items from a Collection
        //Iterators are designed to easily change the collections that they loop through
        //The remove() method can remove items from a collection while looping

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(34);
        numbers.add(8);
        numbers.add(5);
        numbers.add(12);
        numbers.add(23);
        numbers.add(6);
        numbers.add(2);

        Iterator<Integer> it = numbers.iterator();

        //Trying to remove items using a for loop or a for-each loop would not work correctly 
        //because the collection is changing size at the same time that the code is trying to loop
        
        while(it.hasNext()) {
            Integer i = it.next();
            if(i<10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
