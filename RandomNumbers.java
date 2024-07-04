public class RandomNumbers {
    public static void main(String[] args) {
        //Use Math.random() method to generate a random number.
        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println(Math.random());

        //To get random numbers between 0 and 100
        int randomNum = (int)(Math.random() * 100);
        System.out.println(randomNum);
    }
}
