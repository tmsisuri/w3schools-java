public class Arrays {
    public static void main(String[] args) {
        //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value
        //To declare an array, define the variable type with square brackets

        //declare an array and  insert values to it
        String drinks[] = {"Tea" , "coffee" , "Wine" , "Hot chocolate"};
        
        
        //Access the Elements of an Array
        //You can access an array element by referring to the index number
        //Array indexes start with 0: [0] is the first element. [1] is the second element
        System.out.println(drinks[3]);

        //Change an Array Element
        //To change the value of a specific element, refer to the index number
        drinks[2] = "Milkshake";
        System.out.println(drinks[2]);

        //Array Length
        //To find out how many elements an array has, use the length property
        System.out.println(drinks.length);
    }
}
