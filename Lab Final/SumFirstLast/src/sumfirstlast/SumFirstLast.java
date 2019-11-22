
package sumfirstlast;

import java.util.Scanner;

public class SumFirstLast {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        int firstdigit,lastdigit,sum;
        firstdigit=num;
        while(firstdigit>=10){
            firstdigit/=10;
        }
        lastdigit=num%10;
        sum=firstdigit+lastdigit;
        System.out.println("Sum = "+sum);
    }
    
}
