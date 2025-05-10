package ARRAYS;
import java.util.*;

public class linearSearch{

    public static int Search(String menu[] , String key){
        for (int i = 0 ;i<menu.length ; i++){
            if (menu[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int numbers[] = {12,15,14,18,10,25,36,78,54};
        String menu[] = {"Dosa" , "Idli" , "Puri" , "Biryani" , "Khichidi" , "DalRice" , "IceCream" , "Pasta"};
        System.out.println("Enter the dish to find it's Key : ");
        Scanner sc = new Scanner(System.in);
        String key = sc.next();

        int index = Search(menu, key);
        if(index ==-1){
            System.out.println("Key not Found");
        }else{
            System.out.println("Value Found at Index: " + index);
        } 
        sc.close();
        
     }
}