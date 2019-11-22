
package labfinalproblems;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int base,exponent;
        int power=1;
        Scanner scanf=new Scanner(System.in);
        base=scanf.nextInt();
        exponent=scanf.nextInt();
        for(int i=1;i<=exponent;i++){
            power=power*base;
        }
        
        System.out.println(power);
    }
    
}
