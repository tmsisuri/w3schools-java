public class MathClass {
    public static void main(String[] args) {
        //The Java Math class has many methods that allows you to perform mathematical tasks on numbers

        //The Math.max(x,y) method can be used to find the highest value of two values
        System.out.println(Math.max(5,72));

        //The Math.min(x,y) method can be used to find the lowest value of two values
        System.out.println(Math.min(56, 24));

        //The Math.sqrt(x) method returns the square root of number
        System.out.println(Math.sqrt(256));

        //The Math.abs(x) method returns the absolute (positive) value of number
        System.out.println(Math.abs(-28.837));

        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println(Math.random());

        //if you only want a random number between 0 and 100, you can use the following formula
        int randomNum = (int)(Math.random()*100); //0 to 100
        System.out.println(randomNum);
        
    }
}
