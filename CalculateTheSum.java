public class CalculateTheSum {
    public static void main(String[] args) {
        int nums[] = {1,4,7,2,6};
        int sum = 0;
        
        for(int i=0 ; i <nums.length ; i++) {
            sum += nums[i];
        }
        System.out.println("The sum is : " + sum);
    }
}
