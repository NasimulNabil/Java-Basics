
package sumdigit;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        System.out.println(sum);
    }
    
}
