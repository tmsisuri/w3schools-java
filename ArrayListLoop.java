import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for(String i : cars) {
            System.out.println(i);
        }
    }
}
