package Arrays.Level_1;

import java.util.*;

public class ValueTill10 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int[] arr=new int [10];
        System.out.println("Enter number for sum: ");
        int a=s.nextInt();
        int i=0,b=0,c=0;
        while(a>0 && i<11){
            arr[i]=a;
            c+=a;
            a=s.nextInt();
            i++;
        }
        System.out.println("Sum= " + c);
        System.out.println(Arrays.toString(arr));
    }
}

