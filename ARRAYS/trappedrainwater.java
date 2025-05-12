package ARRAYS;
public class trappedrainwater {
    
    public static void trappedwater(int height[]){
        int leftmaxbound[] = new int[height.length];
        leftmaxbound[0] = height[0];

        for(int i = 1; i< height.length; i++){
            leftmaxbound[i] = Math.max(leftmaxbound[i-1] , height[i]);
        }

        int rightmaxbound[] = new int[height.length];
        rightmaxbound[height.length-1] = height[height.length-1];

        for(int i = height.length-2 ; i>=0;i--){
            rightmaxbound[i] = Math.max(rightmaxbound[i+1] , height[i]);
        }

        int trapped_water = 0;
        int width = 1;
        for(int i = 0; i<height.length ; i++){
            int waterlevel = Math.min(leftmaxbound[i], rightmaxbound[i]);
            trapped_water += (waterlevel - height[i]) *width;
        }
        System.out.println(trapped_water);
    }    


    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        trappedwater(height);
    }
}
