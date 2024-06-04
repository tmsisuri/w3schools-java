public class ThrowKeyword {
    public static void main(String[] args) {
        //The throw statement allows you to create a custom error
        //The throw statement is used together with an exception type
        //There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException

        int age = 15;

        try {
            if(age < 18) {
                throw new ArithmeticException();
            } else {
                System.out.println("Access granted - You are old enough!");
            }
        } 
        catch(ArithmeticException e) {
            System.out.println("Access denied - You must be at least 18 years old. " + e);
        }
    }
}
