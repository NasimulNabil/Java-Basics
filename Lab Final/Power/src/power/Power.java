
package power;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int power=1;
        Scanner scanf=new Scanner(System.in);
        int base=scanf.nextInt();
        int expo=scanf.nextInt();
        for(int i=1;i<=expo;i++){
            power*=base;
        }
        System.out.printf("%d ^ %d = %d\n",base,expo,power);
    }
    
}
