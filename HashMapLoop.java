import java.util.HashMap;

public class HashMapLoop {
    public static void main(String[] args) {
        HashMap<String , String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        //Use the keySet() method if you only want the keys
        for(String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        //Use the values() method if you only want the values
        for(String j : capitalCities.values()) {
            System.out.println(j);
        }

        // Print keys and values
        for(String k : capitalCities.keySet()) {
            System.out.println("key : " + k + " and value : " + capitalCities.get(k));
        }

    }
}
