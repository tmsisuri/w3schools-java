public class WhileLoop {
    public static void main(String[] args) {
        //Loops
        //Loops can execute a block of code as long as a specified condition is reached
        //Loops are handy because they save time, reduce errors, and they make code more readable

        //while loop
        //The while loop loops through a block of code as long as a specified condition is true
        int i = 0;
        while (i < 5) {
            System.out.println(i);         
            i++;   
        }

        //do while loop
        //The do while loop is a variant of the while loop
        //This loop will execute the code block once, before checking if the condition is true
        //Then it will repeat the loop as long as the condition is true
        //The loop will always be executed at least once, even if the condition is false
        //because the code block is executed before the condition is tested

        int j = 5;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);

    }
}
