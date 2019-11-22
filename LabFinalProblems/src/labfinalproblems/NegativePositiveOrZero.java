
package labfinalproblems;

import java.util.Scanner;


public class NegativePositiveOrZero {
    public static void main(String[] args) {
        int num;
        Scanner scanf=new Scanner(System.in);
        num=scanf.nextInt();
        if(num>0){
            System.out.println("The number is positive");
        }
        else if(num<0){
            System.out.println("The number is negative");
        }
        else if(num==0){
            System.out.println("The number is zero");
        }
    }
    
}
