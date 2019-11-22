
package javaapplication18;

import java.util.Scanner;


public class Pallindrome {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanf.nextInt();
        int sum=0,digit;
        int temp=num;
        while(num!=0){
            digit=num%10;
            sum=(sum*10)+digit;
            num=num/10;
        }
        if(temp==sum)
            System.out.println("The Number is Pallindrome");
        else
            System.out.println("The Number is not Pallindrome");
    }
    
}
