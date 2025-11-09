package RECURSION;
//Get All the subsequences of a string in an arraylist and return that ArrayList..

import java.util.ArrayList;

public class getsubsequences{
    public static void main(String[] args) {
        System.out.println(getss("abc"));
    }

    public static ArrayList<String> getss(String str){
        if(str.length()==0 ){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recResult = getss(ros);
        for(int i=0;i<recResult.size();i++){
            myResult.add(recResult.get(i));
            myResult.add(cc+recResult.get(i));
        }
        return myResult;

    }
}