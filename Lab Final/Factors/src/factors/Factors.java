
package factors;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }
        System.out.print("\n");
    }
    
}
