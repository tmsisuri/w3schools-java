public class ForLoop {
    public static void main(String[] args) {
        //When you know exactly how many times you want to loop through a block of code, use the for loop
        for(int i=0; i<5; i++) {
            System.out.println(i);
        }

        //Nested Loops
        //It is also possible to place a loop inside another loop. This is called a nested loop
        //The "inner loop" will be executed one time for each iteration of the "outer loop"
        for (int j=1; j<=2; j++) {
            System.out.println("Outer : " + j);
            for (int k=1; k<=3; k++) {
                System.out.println("Inner : " + k);
            }
        }
    }
}
