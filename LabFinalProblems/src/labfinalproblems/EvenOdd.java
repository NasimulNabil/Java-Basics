
package labfinalproblems;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n;
        Scanner scanf=new Scanner(System.in);
        n =scanf.nextInt();
        if(n%2==0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
    
    
}
