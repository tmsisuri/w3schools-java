import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        //LinkedList Methods
        //For many cases, the ArrayList is more efficient as it is common to need access to random items in the list
        //but the LinkedList provides several methods to do certain operations more efficiently

        //   Method	            Description	
        //   addFirst()	        Adds an item to the beginning of the list.	
        //   addLast()	        Add an item to the end of the list	
        //   removeFirst()	    Remove an item from the beginning of the list.	
        //   removeLast()	    Remove an item from the end of the list	
        //   getFirst()	        Get the item at the beginning of the list	
        //   getLast()	        Get the item at the end of the list

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");

        //LinkedList size
        System.out.println(cars.size());

        //Access an Item
        System.out.println(cars.get(2));
        System.out.println(cars.getFirst()); //Get the item at the beginning of the list
        System.out.println(cars.getLast()); //Get the item at the end of the list

        //Change an Item
        cars.set(4,"Ferrari");
        System.out.println(cars);

        //add new item
        cars.addFirst("Lamborghini"); //Adds an item to the beginning of the list
        cars.addLast("Audi"); //Add an item to the end of the list
        System.out.println(cars);

        //remove an item
        cars.remove(0);
        System.out.println(cars);

        cars.remove("Audi");
        System.out.println(cars);

        //remove an item from the beginning of the list
        cars.removeFirst();
        System.out.println(cars);

        //remove an item from the end of the list
        cars.removeLast();
        System.out.println(cars);

        //emove all the elements
        cars.clear();
        System.out.println(cars);


        
    }
}
