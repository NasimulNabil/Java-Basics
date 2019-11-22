
package multiplicationtable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d",num,i,(num*i));
            System.out.println("\n");
        }
    }
    
}
