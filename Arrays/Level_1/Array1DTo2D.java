package Arrays.Level_1;

import java.util.*;

public class Array1DTo2D {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of 2d Array: ");
        int a=s.nextInt();
        int b=s.nextInt();
        ArrayList<Integer> ar1 = new ArrayList<>();
        int[][] arr=new int[a][b];
        int r=arr.length;
        int c=arr[0].length;
        System.out.println("Enter 2D array values =");
        for(int i=0; i<r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("The 1D array of the 2D is =");
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                ar1.add(arr[i][j]);
            }
        }
        System.out.println(ar1);
    }
}
