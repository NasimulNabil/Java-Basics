
package labfinalproblems;

import java.util.Scanner;


public class Prime1Ton {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num= scanf.nextInt();
        int isPrime;
       int sum=0;
        for(int i=2;i<=num;i++){
            isPrime=1;
            for(int j=2; j<=i/2;j++){
                if(i%j==0){
                    isPrime=0;
                    break;
                }
            }
            if(isPrime==1){
                System.out.println(i);
                //sum+=i;
            }
        }
        System.out.println("\n");
        
        
    }
    
}
