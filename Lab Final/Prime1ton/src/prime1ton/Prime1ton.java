
package prime1ton;

import java.util.Scanner;

public class Prime1ton {
    public static void main(String[] args) {
        int isprime;
        Scanner scanf=new Scanner(System.in);
        int n=scanf.nextInt();
        for(int i=2;i<=n;i++){
            isprime=1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isprime=0;
                    break;
                }
            }
            if(isprime==1){
                System.out.print(i+",");
            }
        }
        System.out.print("\n");
        
    }
    
}
