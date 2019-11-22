
package arrray;

import java.util.Scanner;


public class Prime {
        public static void main(String[] args) {
        int num;
        int isPrime=1;
        Scanner scanf=new Scanner(System.in);
        num=scanf.nextInt();
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0){
                isPrime=0;
                        break;                
            }
        }
        if(isPrime==1){
            System.out.println("Number is prime");
        }
        
            else
             System.out.println("Not Prime");

        
        
        
    }
 
    
}
