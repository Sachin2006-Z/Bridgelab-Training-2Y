package Arrays.Level_1;

import java.util.*;

public class MultOf6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int[] r = new int[4];
        int j=0;
        for (int i = 6; i <= 9; i++) {
            r[j] = a * i;
            j++;
        }
        System.out.println(Arrays.toString(r));
    }
}
