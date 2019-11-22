
package labfinalproblems;

import java.util.Scanner;

public class SumOfOddEven {
    public static void main(String[] args) {
        
    
    int n;
    int sum=0;
    Scanner scanf=new Scanner(System.in);
    n=scanf.nextInt();
    for(int i=0;i<=n;i+=2){
        sum+=i;
    }
        System.out.println("Sum of odd number: "+sum);
    
            
    
    
    
}
}
