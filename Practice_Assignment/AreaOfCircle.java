package Practice_Assignment;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius of Circle: ");
        double r=s.nextDouble();
        System.out.println("Area of a Circle: " +(3.14*(r*r)));
    }
}
