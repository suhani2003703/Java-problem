package numbersystem;
import java.util.*;
public class palindromeNumber{
    public  static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        while(n > 0){
            int digits = n % 10;
            reverse = reverse * 10 + digits;
            n = n/10;
        }
        if ( original == reverse){
            System.out.println("true");
        }else{
             System.out.println( "false");

        }
    }
}
        
