package numbersystem;
import java.util.*;
public class Main8{
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b; 
            b = a % b;
            a = temp;
        }
        return a;
    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(); // numerator1
        int d1 = sc.nextInt(); // denominator1
        int n2 = sc.nextInt(); // numerator2
        int d2 = sc.nextInt(); // denominator2

        int numerator = (n1 * d2) + (n2 * d1);
        int denominator = d1 * d2;

        int gcd = gcd(numerator, denominator);

        numerator = numerator / gcd;
        denominator = denominator / gcd;

        System.out.println("Numerator = " + numerator);
        System.out.println("Denominator = " + denominator);
    }
}

