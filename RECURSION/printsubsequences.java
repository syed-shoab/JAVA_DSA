package RECURSION;

public class printsubsequences{
    public static void main(String[] args) {
        printSubSeq("abc", "");
    }

    public static void printSubSeq(String str, String res){
        if(str.length()==0){
            System.out.println(res);
            return;
        }

        char cc = str.charAt(0);
        String ros = str.substring(1);
        printSubSeq(ros, res);
        printSubSeq(ros, res+cc);
    }
}