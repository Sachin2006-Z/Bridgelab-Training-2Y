package Arrays.Level_1;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int[] r = new int[10];
        for (int i=1; i <11; i++) {
            r[i] = a * i;
        }
        System.out.println(Arrays.toString(r));
    }
}
