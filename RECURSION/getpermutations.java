package RECURSION;

import java.util.ArrayList;

public class getpermutations{
    public static void main(String[] args) {
        
        System.out.println(getper("abc"));
    }

    public static ArrayList<String> getper (String Str){
        if(Str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char cc = Str.charAt(0);
        String ros = Str.substring(1);

        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recResult = getper(ros);

        for(String recS : recResult){
            for(int i =0;i<Str.length();i++){
                String val = recS.substring(0,i) + cc + recS.substring(i);
                myResult.add(val);
            }
        }

        return myResult;
    }

}