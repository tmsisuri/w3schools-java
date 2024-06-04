public class Finally {
    public static void main(String[] args) {
        //The finally statement lets you execute code, after try...catch, regardless of the result
        try {
            int[] numbers = {1, 2, 5, 8};
            System.out.println(numbers[6]);
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        } finally {
            System.out.println("The 'try catch' is finished" );
        }
    }
}
