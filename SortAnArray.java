import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};

        //to sort an array use the sort() method
        Arrays.sort(cars);
        
        for(String i : cars) {
            System.out.println(i);
        }
    }
}
