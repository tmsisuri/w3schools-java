import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        //use Math.sqrt() to find the square root of a number
        System.out.println(Math.sqrt(number));
        sc.close();
    }
}
