public class Switch {
    public static void main(String[] args) {
        //The Switch Statements
        //The switch statement selects one of many code blocks to be executed
        //The switch expression is evaluated once
        //The value of the expression is compared with the values of each case
        //If there is a match, the associated block of code is executed

        int day = 4;
        switch (day) {
            case 1 :
               System.out.println("Monday");
               break;
            case 2 : 
               System.out.println("Tuesday");
               break;
            case 3 :
               System.out.println("Wednesday");
               break;
            case 4 :
               System.out.println("Thursday");
               break;
            case 5:
               System.out.println("Friday");
               break;
            case 6:
               System.out.println("Saturday");
               break;
            case 7:
               System.out.println("Sunday");
               break;
            default :
               System.out.println("Invalid day");   
        }
        //The break Keyword
        //When Java reaches a break keyword, it breaks out of the switch block
        //This will stop the execution of more code and case testing inside the block
        //When a match is found, and the job is done, it's time for a break. There is no need for more testing
        //A break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block

        //The default Keyword
        //The default keyword specifies some code to run if there is no case match
        //if the default statement is used as the last statement in a switch block, it does not need a break
    }
}
