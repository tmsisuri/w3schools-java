import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        //A HashMap store items in "key/value" pairs
        //One object is used as a key (index) to another object (value) 
        //It can store different types: String keys and Integer values, or the same type, like: String keys and String values

        HashMap<String , String> capitalCities = new HashMap<String , String>();

        //Add Items
        //to add items to it, use the put() method
        capitalCities.put("England ", " London");
        capitalCities.put("Germany ", " Berlin");
        capitalCities.put("Norway ", " Oslo");
        capitalCities.put("USA ", " Washington DC");
        System.out.println(capitalCities);

        //HashMap Size
        //To find out how many items there are, use the size() method
        System.out.println(capitalCities.size());

        //Access an Item
        System.out.println(capitalCities.get("England "));

        //Remove an Item
        //To remove an item, use the remove() method and refer to the key
        capitalCities.remove("England ");
        System.out.println(capitalCities);

        //Remove all Items
        capitalCities.clear();
        System.out.println(capitalCities);

    }
}
