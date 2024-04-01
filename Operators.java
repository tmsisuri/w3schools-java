public class Operators {
    public static void main(String[] args) {
        //Operators are used to perform operations on variables and values
        int sum1 = 25 +50;
        int sum2 = sum1 + 50;
        int sum3 = sum1 + sum2;
        System.out.println(sum3);

        //Java divides the operators into the following groups
        // Arithmetic operators
        // Assignment operators
        // Comparison operators
        // Logical operators
        // Bitwise operators

        //Arithmetic operators
        // Arithmetic operators are used to perform common mathematical operations

        // Operator	   Name	              Description	                             Example	 
        //   +	       Addition	          Adds together two values	                 x + y	
        //   -	       Subtraction	      Subtracts one value from another	         x - y	
        //   *	       Multiplication	  Multiplies two values	                     x * y	
        //   /	       Division        	  Divides one value by another	             x / y	
        //   %	       Modulus	          Returns the division remainder	         x % y	
        //   ++	       Increment          Increases the value of a variable by 1	 ++x	
        //   --	       Decrement	      Decreases the value of a variable by 1	 --x

        int a = 4;
        int b = a++; // (b = a + 1)
        System.out.println(b);

        int c = 5;
        int d = c--; // (d = c - 1)
        System.out.println(d);

        // Assignment Operators
        //Assignment operators are used to assign values to variables.
        int x = 10;
        System.out.println(x);

        //A list of all assignment operators:

        // Operator  	 Example	 Same As	
        //   =	         x = 5	     x = 5	
        //   +=	         x += 3	     x = x + 3	
        //   -=	         x -= 3	     x = x - 3	
        //   *=	         x *= 3	     x = x * 3	
        //   /=        	 x /= 3   	 x = x / 3	
        //   %=	         x %= 3	     x = x % 3	
        //   &=	         x &= 3	     x = x & 3	
        //   |=	         x |= 3	     x = x | 3	
        //   ^=	         x ^= 3	     x = x ^ 3	
        //   >>=	     x >>= 3	 x = x >> 3	
        //   <<=	     x <<= 3	 x = x << 3	

        //Comparison Operators
        //Comparison operators are used to compare two values (or variables)
        //The return value of a comparison is either true or false. These values are known as Boolean values

        int g = 15;
        int h = 7;
        System.out.println(g > h); // returns true, because 5 is higher than 3

        // Operator	   Name	                        Example	
        //    ==	   Equal to	                    x == y	
        //    !=	   Not equal	                x != y	
        //    >	       Greater than	                x > y	
        //    <	       Less than	                x < y	
        //    >=	   Greater than or equal to 	x >= y	
        //    <=	   Less than or equal to	    x <= y

        // Logical Operators
        // You can also test for true or false values with logical operators
        // Logical operators are used to determine the logic between variables or values

        // Operator 	Name	       Description	                                               Example	
        //   && 	    Logical and	   Returns true if both statements are true	                   x < 5 &&  x < 10	
        //   || 	    Logical or	   Returns true if one of the statements is true	           x < 5 || x < 4	
        //   !	        Logical not	   Reverse the result, returns false if the result is true	   !(x < 5 && x < 10)
    }
}
