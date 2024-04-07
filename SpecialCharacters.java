public class SpecialCharacters {
    public static void main(String[] args) {
        //String txt = "We are the so-called "Vikings" from the north.";
        //Because strings must be written within quotes, Java will misunderstand this string, and generate an error
        //The solution to avoid this problem, is to use the backslash escape character.

        //The backslash (\) escape character turns special characters into string characters:

        /* 
        
        Escape character	Result	   Description
            \'	               '	   Single quote
            \"	               "	   Double quote
            \\	               \	   Backslash      
        

        */

        //The sequence \"  inserts a double quote in a string
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        //The sequence \'  inserts a single quote in a string
        String txt1 = "It\'s alright.";
        System.out.println(txt1);

        //The sequence \\  inserts a single backslash in a string
        String txt2 = "The character \\ is called backslash.";
        System.out.println(txt2);

        //Other common escape sequences that are valid in Java are:

        /* 
        Code	Result	
         \n 	New Line	
         \r	    Carriage Return	
         \t 	Tab	
         \b 	Backspace	
         \f 	Form Feed

        */
    }
}
