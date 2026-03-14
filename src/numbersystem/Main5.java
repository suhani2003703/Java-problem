package numbersystem;
import java.util.*;
public class Main5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 9;
        int max = 0;
        while(n > 0){
            int digit = n % 10;
            if(max > digit){
                max = digit;
            }
            if (digit < min){
                min = digit;
            }
            n = n/ 10;
        }
        System.out.println("Largest digit :" + max);
        System.out.println("Smalledt digit" + min);
        
    }
}
            
