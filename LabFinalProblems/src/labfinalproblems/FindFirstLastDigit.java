 
package labfinalproblems;

import java.util.Scanner;


public class FindFirstLastDigit {
    public static void main(String[] args) {
        int sum,num,firstD,lastD;
        Scanner scanf=new Scanner(System.in);
        num=scanf.nextInt();
        firstD=num;
        while(firstD>=10){
            firstD=firstD/10;
        }
        lastD=num%10;
        System.out.println("First digit: "+ firstD+ " last digit: "+lastD);
        sum=firstD+lastD;
        System.out.println("Sum of firstlast: "+sum);
    }
    
}
