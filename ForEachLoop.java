public class ForEachLoop {
    public static void main(String[] args) {
        //for-each loop is used exclusively to loop through elements in an array

        String cars[] = {"Volvo" , "BMW" , "Ford" , "Mazda"};
        //for (type variableName : arrayName)
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
