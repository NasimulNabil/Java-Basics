
package prime;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int isprime=1;
        Scanner scanf=new Scanner(System.in);
        int n=scanf.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isprime=0;
                break;
            }
        }
        if(isprime==1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    
}
