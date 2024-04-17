public class MultidimensionalArrays {
    public static void main(String[] args) {
        //A multidimensional array is an array of arrays
        //Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns
        //To create a two-dimensional array, add each array within its own set of curly braces
        int numbers[][] = {{1, 2, 3, 4} , {5, 6, 7, 8}};

        //Access Elements
        //To access the elements of the numbers array, specify two indexe
        //one for the array, and one for the element inside that array
        System.out.println(numbers[0][2]); //first array third element - 3
        System.out.println(numbers[1][3]); //second array fourth element - 8

        //Change Element Values
        numbers[1][3] = 15;
        System.out.println(numbers[1][3]);

        //Loop Through a Multi-Dimensional Array
        int myNumbers[][] = {{2, 5, 8, 3} , {11, 23, 45, 34}};
        for(int i=0 ; i<myNumbers.length ; i++) {
            for(int j=0 ; j<myNumbers[i].length ; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
