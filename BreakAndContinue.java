public class BreakAndContinue {
    public static void main(String[] args) {
        //Break statement
        //break statement used to "jump out" of a switch statement
        //it can also be used to jump out of a loop
        
        for (int i=0 ; i<10 ; i++) {
            if(i==4){
                break;
            }
            System.out.println(i); //output (0 , 1 , 2 , 3)
        }

        //Continue statement
        //The continue statement breaks one iteration (in the loop), if a specified condition occurs
        //and continues with the next iteration in the loop

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i); //output (0 , 1 , 2 , 3 , 5 , 6 , 7 , 8 , 9) 
          }
    }
}
