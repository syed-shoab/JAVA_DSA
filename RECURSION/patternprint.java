package RECURSION;
public class patternprint{
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int col=1;
        pattern(n,row,col);
    }

    public static void pattern(int n,int row,int col){
        if(row>n){
            return;
        }
        if(col>row){
            System.out.println();
            pattern(n, row+1, 1);
            return;
        }
        System.out.print("*");
        pattern(n, row, col+1);
    }
}