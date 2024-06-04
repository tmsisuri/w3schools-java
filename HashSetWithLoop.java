import java.util.HashSet;

public class HashSetWithLoop {
    public static void main(String[] args) {
        //Loop through the items of an HashSet with a for-each loop
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        for(String i : cars) {
            System.out.println(i);
        }
    }
}
