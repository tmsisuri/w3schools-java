import java.util.HashMap;

public class HashMapForNumbers {
    public static void main(String[] args) {
        //Keys and values in a HashMap are actually objects
        //In the previous example, we used objects of type "String"
        //Remember that a String in Java is an object (not a primitive type)
        //To use other types, such as int, you must specify an equivalent wrapper class: Integer 
        //For other primitive types, use: Boolean for boolean, Character for char, Double for double

        HashMap<String , Integer> people = new HashMap<String , Integer>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for(String i : people.keySet()) {
            System.out.println("key : " + i + " value : " + people.get(i));
        }
    }
}
