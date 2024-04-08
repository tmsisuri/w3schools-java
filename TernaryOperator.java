public class TernaryOperator {
    public static void main(String[] args) {
        //There is also a short-hand if else, which is known as the ternary operator because it consists of three operands
        //It can be used to replace multiple lines of code with a single line
        //and is most often used to replace simple if else statements

        int x = 45;
        int y = 76;
        if(x > y){
            System.out.println("x is greater than y");
        }
        else{
            System.out.println("y is greater than x");
        }

        //variable = (condition) ? expressionTrue :  expressionFalse;
        String result = (x > y) ? "x is greater than y" : "y is greater than x" ;
        System.out.println(result);

    }
}
