
package sumprime;

import java.util.Scanner;

public class SumPrime {
    public static void main(String[] args) {
        int isprime,sum=0;
        Scanner scanf=new Scanner(System.in);
        int n1=scanf.nextInt();
        int n2=scanf.nextInt();
        for(int i=n1;i<=n2;i++){
            isprime=1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isprime=0;
                    break;
                }
            }
            if(isprime==1){
                sum+=i;
            }
        }
        System.out.println("Sum = "+sum);
    }
    
}
