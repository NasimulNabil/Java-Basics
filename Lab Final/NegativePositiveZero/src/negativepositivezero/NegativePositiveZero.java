
package negativepositivezero;

import java.util.Scanner;

public class NegativePositiveZero {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }
        else if(num<0){
            System.out.println("Number is negative");
        }
        else if(num==0){
            System.out.println("Number is zero");
        }
    }
    
}
