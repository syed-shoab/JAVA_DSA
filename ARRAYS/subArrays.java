package ARRAYS;

public class subArrays {

    public static void printSubArr(int numbers[]){
        int ts=0;
        int minsum= Integer.MAX_VALUE;
        int maxsum= Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];
                    if (sum < minsum) {
                        minsum = sum;
                    }
                    if(sum > maxsum){
                        maxsum = sum;
                    }
                }
                System.out.println(";& sum = " + sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("min sum : " +minsum);
        System.out.println("max sum : "+maxsum);
        System.out.println("Total Sub Arrays = "+ts);

    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubArr(numbers);
    }
}
