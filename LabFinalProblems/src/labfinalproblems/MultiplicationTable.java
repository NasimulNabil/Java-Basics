
package labfinalproblems;

import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {
        int num;
        Scanner scanf=new Scanner(System.in);
        num=scanf.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
        
    }
    
}
