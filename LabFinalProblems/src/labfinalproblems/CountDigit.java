
package labfinalproblems;

import java.util.Scanner;


public class CountDigit {
    public static void main(String[] args) {
        int num;
        Scanner scanf=new Scanner(System.in);
        num=scanf.nextInt();
        int count=0;
        while(num!=0){
            count++;
            num/=10;
            
        }
        System.out.println(count);
    }
    
}
