
package sumodd;

import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanf=new Scanner(System.in);
        int n=scanf.nextInt();
        for(int i=1;i<=n;i+=2){
            sum+=i;
        }
        System.out.println("Sum = "+sum);
    }
    
}
