public class IfElse {
    public static void main(String[] args) {
        //Use the if statement to specify a block of Java code to be executed if a condition is true
        if(45 > 38){
            System.out.println("45 is greater than 38");
        }

        //Use the else statement to specify a block of code to be executed if the condition is false
        int x = 25;
        int y = 67;
        if(x > y) {
            System.out.println("x is greater than y");
        } 
        else {
            System.out.println("y is greater than x");
        }

        //Use the else if statement to specify a new condition if the first condition is false
        int a = 36;
        int b = 68;
        int c = 57;
        if((a > b) && (a > c)){
            System.out.println("a is greater than b or c");
        }
        else if(b > c){
            System.out.println("b is greater than a or c");
        }
        else{
            System.out.println("c is greater than a or b");
        }
    }
}
