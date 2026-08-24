package Arrays.Level_1;

import java.util.Scanner;
class EligibleForVote{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<10;i++) {
            System.out.println("Enter Your age");
            int a = s.nextInt();
            if (a >= 18) {
                System.out.println("You can vote");
            } else {
                System.out.println("You can not vote");
            }
        }
    }
}