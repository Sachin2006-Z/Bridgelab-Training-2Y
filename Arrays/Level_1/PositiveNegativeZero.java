package Arrays.Level_1;

import java.util.*;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]+" Positive");
            } else if (arr[i] < 0) {
                System.out.println(arr[i]+" Negative");
            } else if(arr[i]==0) {
                System.out.println(arr[i]+" Your number is Zero ");
            }
            if (arr[i]%2==0) {
                System.out.println("and Even");
            }
            if (arr[i]%2!=0 ) {
                System.out.println("and odd");
            }
        }
    }
}
