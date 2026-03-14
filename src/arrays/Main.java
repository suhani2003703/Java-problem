package arrays;
import java.util.*;

public class Main {
    public static int smallestNumber(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Aap ko kitne elements chahiye: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int result = smallestNumber(arr);
        System.out.println("The smallest number in the array is: " + result);
        System.err.println("I Love you suhani: " + result);
    }
}