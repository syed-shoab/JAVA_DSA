package ARRAYS;

public class maxSubArraySum {
    public static void maxSubArrSum(int numbers[]){
        int prefixArr[] = new int[numbers.length];
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        prefixArr[0] = numbers[0];

        for (int i=1;i<numbers.length;i++){
            prefixArr[i]=prefixArr[i-1] + numbers[i];
        }

        for(int i = 0 ; i<numbers.length;i++){
            for(int j =i ;j<numbers.length;j++){
                sum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i-1];

                if(maxsum < sum){
                    maxsum = sum;
                }
            }
        }
        System.out.println("Maximum Sub Array Sum = " + maxsum);

    } 
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubArrSum(numbers);
    }
}
