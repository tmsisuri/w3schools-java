import java.util.HashSet;

public class JavaHashSet {
    public static void main(String[] args) {
        //A HashSet is a collection of items where every item is unique
        HashSet<String> cars = new HashSet<String>();

        //Add items
        //to add items to it, use the add() method
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars); //even though BMW is added twice it only appears once in the set because every item in a set has to be unique

        //HashSet Size
        //To find out how many items there are, use the size method
        System.out.println(cars.size());

        //Check If an item exists
        //To check whether an item exists in a HashSet, use the contains() method
        System.out.println(cars.contains("Mazda"));
        

        //Remove an item
        //To remove an item, use the remove() method
        cars.remove("Volvo");
        System.out.println(cars);

        //Remove all items
        cars.clear();
        System.out.println(cars);

    }
}
