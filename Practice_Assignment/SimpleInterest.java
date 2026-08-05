package Practice_Assignment;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Principle, Rate and Time: ");
        int p=s.nextInt();
        int r=s.nextInt();
        int t=s.nextInt();
        System.out.println("Simple Intrest is: "+((p*r*t)/100));
    }
}
