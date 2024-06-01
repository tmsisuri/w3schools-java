import java.util.HashMap;

public class HashMapWithLoop {
    public static void main(String[] args) {
        HashMap<String , String> capitalCities = new HashMap<String , String>();
        capitalCities.put("England ", " London");
        capitalCities.put("Germany ", " Berlin");
        capitalCities.put("Norway ", " Oslo");
        capitalCities.put("USA ", " Washington DC");
        System.out.println(capitalCities);

        //Loop through the items of a HashMap with a for-each loop
        //Use the keySet() method if you only want the keys, and use the values() method if you only want the values

        // Print keys
        for(String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for(String j : capitalCities.values()) {
            System.out.println(j);
        }

        // Print keys and values
        for(String k : capitalCities.keySet()) {
            System.out.println("key : " + k + "value : " + capitalCities.get(k));
        }
    }
}
