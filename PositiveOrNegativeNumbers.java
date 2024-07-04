import java.util.Scanner;

public class PositiveOrNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        if(number > 0) {
            System.out.println("The value is a positive number");
        }
        else if (number < 0) {
            System.out.println("The value is a negative number");
        } 
        else {
            System.out.println("The value is 0");
        }
        sc.close();
    }
}
