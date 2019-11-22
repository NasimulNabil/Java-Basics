
package labfinalproblems;

import java.util.Scanner;

public class SumAndProductOfDigit {
    public static void main(String[] args) {
        int num,sum=0,product=1;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
      while(num!=0){
          sum+=num%10;
          product=product*(num%10);
          num/=10;
      }
        System.out.println("Sum: "+sum+ " product: " +product);
        
    }
    
}
