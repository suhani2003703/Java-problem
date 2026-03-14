package numbersystem;
import java.util.*;
public class primeNumber1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int num = 2; num <= n; num++){
            boolean isPrime = true;
            for(int i = 2; i < Math.sqrt(num); i++){
                if( i % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum += num;
            }
            System.out.println(sum);
        }
    }
}
            


