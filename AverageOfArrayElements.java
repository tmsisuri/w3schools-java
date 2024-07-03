public class AverageOfArrayElements {
    public static void main(String[] args) {
        int[] ages = {20, 22, 18, 35, 43, 24, 17, 56, 34, 11};
        float avg = 0;
        float sum = 0;
        
        // Get the length of the array
        int length = ages.length;

        for(int age : ages) {
            sum += age;
        }
        avg = sum / length;
        System.out.println(avg);
    }
}
