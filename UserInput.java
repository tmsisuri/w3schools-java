import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //The Scanner class is used to get user input, and it is found in the java.util package
        //To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation

        Scanner scanner = new Scanner(System.in); //create a scanner object
        System.out.println("Enter user name: ");
        String userName = scanner.nextLine(); // Read user input
        System.out.println("user name is : " + userName);

        //Input Types

        //   Method	              Description
        //   nextBoolean()	      Reads a boolean value from the user
        //   nextByte()	          Reads a byte value from the user
        //   nextDouble()	      Reads a double value from the user
        //   nextFloat()	      Reads a float value from the user
        //   nextInt()	          Reads a int value from the user
        //   nextLine()	          Reads a String value from the user
        //   nextLong()	          Reads a long value from the user
        //   nextShort()	      Reads a short value from the user

        System.out.println("Enter name, age and salary : ");

        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

        scanner.close();
    }
}
