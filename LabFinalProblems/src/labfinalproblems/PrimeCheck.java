
package labfinalproblems;

import java.util.Scanner;


public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        int isPrime=1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isPrime=0;
                break;
            }
        }
        if(isPrime==1)
            System.out.println("Number is prime");
        else
            System.out.println("Not prime");
        
    }
    
}
