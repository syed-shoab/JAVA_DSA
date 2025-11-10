package RECURSION;

public class printpermutations {
    public static void main(String[] args) {
        printPerm("abc", "");
    }

    public static void printPerm(String str , String res){
        if(str.length() == 0){
            System.out.println(res);
            return;
        }
        
        for(int i =0;i<str.length();i++){
            char cc = str.charAt(i);
            String ros = str.substring(0,i)+str.substring(i+1);

            printPerm(ros, res+cc);
        }
        
    }
}