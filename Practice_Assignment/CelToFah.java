package Practice_Assignment;

import java.util.Scanner;

public class CelToFah {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double Fah=0;
        System.out.print("Enter Celcius value: ");
        double Cel=s.nextDouble();
        Fah= (Cel * 9/5) + 32;
        System.out.println(Fah);
    }
}
