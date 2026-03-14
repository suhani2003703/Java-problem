package numbersystem;
import java.util.*;
public class Main11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp > 0){
            int digits = temp % 10;
            sum = sum + digits;
            temp = temp/10;
        }
        if(n % sum == 0){
            System.out.println("Yes it is a Harshad number");
        }
        else{
             System.out.println("No it is not a Harshad number");
        }
    }
}
        



        
