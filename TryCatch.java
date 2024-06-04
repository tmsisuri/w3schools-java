public class TryCatch {
    public static void main(String[] args) {
        //When an error occurs, Java will normally stop and generate an error message
        //The technical term for this is: Java will throw an exception (throw an error)

        //Java try and catch
        //The try statement allows you to define a block of code to be tested for errors while it is being executed
        //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block
        //The try and catch keywords come in pairs

        int[] numbers = new int[4];
        numbers[0] = 3;
        numbers[1] = 4;
        numbers[2] = 8;
        numbers[3] = 2;

        try {
        System.out.println(numbers[6]);
        }
        //ArrayIndexOutOfBoundsException occurs when you try to access an index number that does not exist
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("Something went wrong...");
        }
    }
}
