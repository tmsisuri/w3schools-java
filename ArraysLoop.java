public class ArraysLoop {
    public static void main(String[] args) {
        //You can loop through the array elements with the for loop
        //and use the length property to specify how many times the loop should run

        //for loop
        String drinks[] = {"Tea" , "coffee" , "Milkshake" , "Hot chocolate"};
        for(int i=0 ; i<drinks.length ; i++) {
            System.out.println(drinks[i]);
        }

        //for each loop
        for(String i : drinks) { //for (type variable : arrayname)
            System.out.println(i);
        }

        //The example above can be read like this (for each String element(called i - as in index) in drinks, print out the value of i)
    }
}
