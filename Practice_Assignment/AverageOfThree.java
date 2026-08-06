package Practice_Assignment;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 number: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c= s.nextInt();
        System.out.println("Average of 3 number is: "+((a+b+c)/3));
    }
}
