package numbersystem;
import java.util.*;
public class Main{
    public static boolean isPalindrome(int n){
        int original = n;
        int reverse = 0;
        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }
        return original == reverse;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        for( int i = min ; i < max; i++){
            if (isPalindrome(i)){
                System.out.print(i + " ");
            }
        }
    }
}








        
