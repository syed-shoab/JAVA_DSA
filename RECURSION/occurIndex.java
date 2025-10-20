package RECURSION;

import java.util.Arrays;

public class occurIndex{
    public static void main(String[] args) {
        int arrar[] = {9,2,9,5,6,9,8,7};
        int si =0;
        int data = 9;
        int count = 0;
        System.out.println("First index: " + firstIndex(arrar, si, data));
        System.out.println("Last Index: " +lastIndex(arrar, si, data));
        System.out.println("All Occurances indexes: " + Arrays.toString(allOccurances(arrar, si, data, count)));
    }

    //Finding first occurance index
    public static int firstIndex(int[] arr,int si,int data){
        if(si == arr.length){
            return -1;
        }

        if(arr[si] == data){
            return si;
        }else{
            return firstIndex(arr, si+1, data);
        }
        
    }

    //Finding last occurance index - start from 0, not end
    public static int lastIndex(int[] arr, int si ,int data){
        if(si == arr.length){
            return -1;
        }
        int index = lastIndex(arr, si+1, data);
        if(index == -1){
            if(arr[si] == data){
                return si;
            }else{
                return -1;
            } 
        }
        return index;
    }

    //Finding all indexes of occurance
    public static int[] allOccurances(int [] arr, int si, int data ,int count){

        if(si == arr.length){
            return new int[count];
        }

        if(arr[si] == data){
            int[] ans = allOccurances(arr, si+1, data, count+1); 
            ans[count] = si;
            return ans;
        }
        else{
            return allOccurances(arr, si+1, data, count);
        }
    }
}