import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        //Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API
        //The package includes many date and time classes

        //    Class	                 Description
        //    LocalDate	             Represents a date (year, month, day (yyyy-MM-dd))
        //    LocalTime	             Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
        //    LocalDateTime	         Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
        //    DateTimeFormatter	     Formatter for displaying and parsing date-time objects

        //Display Current Date
        //To display the current date, import the java.time.LocalDate class, and use its now() method

        LocalDate myDate = LocalDate.now(); // Create a date object
        System.out.println(myDate); // Display the current date

        //Display Current Time
        //To display the current time (hour, minute, second, and nanoseconds), import the java.time.LocalTime class, and use its now() method

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        //Display Current Date and Time
        //To display the current date and time, import the java.time.LocalDateTime class, and use its now() method

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime); //output will be like 2024-05-25T21:33:43.848026

        //Formatting Date and Time
        //The "T" in the example above is used to separate the date from the time
        //You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects
        //The following example will remove both the "T" and nanoseconds from the date-time

        LocalDateTime myDateTime2 = LocalDateTime.now();
        System.out.println("Before formatting : " + myDateTime2);
        DateTimeFormatter myDateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateTime2.format(myDateTimeFormatter);
        System.out.println("After formatting : " + formattedDate);

        //The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format

        //   Value	             Example	
        //   yyyy-MM-dd	         "1988-09-29"	
        //   dd/MM/yyyy	         "29/09/1988"	
        //   dd-MMM-yyyy	     "29-Sep-1988"	
        //   E, MMM dd yyyy   	 "Thu, Sep 29 1988"

        DateTimeFormatter obj1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateTime1 = obj1.format(myDateTime2);
        System.out.println(dateTime1);

        DateTimeFormatter obj2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateTime2 = obj2.format(myDateTime2);
        System.out.println(dateTime2);

        DateTimeFormatter obj3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String dateTime3 = obj3.format(myDateTime2);
        System.out.println(dateTime3);

        DateTimeFormatter obj4 = DateTimeFormatter.ofPattern("yyyy-MM-dd, E");
        String dateTime4 = obj4.format(myDateTime2);
        System.out.println(dateTime4);

      
    }
}
