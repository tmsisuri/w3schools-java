import java.util.Scanner;

public class EvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2 == 0) {
            System.out.println(number + " is a even number");
        }
        else {
            System.out.println(number + " is a odd number");
        }
        sc.close();
    }
}
