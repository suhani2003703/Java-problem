package numbersystem;
import java.util.*;

public class Main3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int digits = 0;
        int temp = n;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;

        while (temp > 0) {
            int digit = temp % 10;   // FIXED
            sum += (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

