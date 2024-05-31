import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        //The ArrayList class is a resizable array
        //The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
        //if you want to add or remove elements to/from an array, you have to create a new one
        //While elements can be added and removed from an ArrayList whenever you want

        ArrayList<String> cars = new ArrayList<String>();

        //Add Items
        //Add elements to the ArrayList, use the add() method
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //Access an Item
        //To access an element in the ArrayList, use the get() method and refer to the index number
        System.out.println(cars.get(2));

        //ArrayList Size
        //To find out how many elements an ArrayList have, use the size method
        System.out.println(cars.size());

        //Change an Item
        //To modify an element, use the set() method and refer to the index number
        cars.set(0, "Opel");
        System.out.println(cars);

        //Remove an Item
        //To remove an element, use the remove() method and refer to the index number
        cars.remove(0);
        System.out.println(cars);

        //To remove all the elements in the ArrayList, use the clear() method
        cars.clear();
        System.out.println(cars);

    }
}
