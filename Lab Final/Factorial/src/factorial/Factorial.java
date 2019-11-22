
package factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
    
}
