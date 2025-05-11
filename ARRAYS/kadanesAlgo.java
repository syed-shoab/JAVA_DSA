package ARRAYS;

public class kadanesAlgo {

    public static void kadanes(int numbers[]){
        int maxsum = Integer.MIN_VALUE;
        int sum =0;
        for (int i =0;i<numbers.length;i++){
            sum += numbers[i];

            maxsum = Math.max(maxsum, sum);
            
            if (sum < 0){
                sum=0;
            }            
        }

        System.out.println("Max SubArray sum is : " + maxsum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
