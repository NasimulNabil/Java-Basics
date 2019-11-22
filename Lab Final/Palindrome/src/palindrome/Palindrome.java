
package palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        int rev=0,n;
        n=num;
        while(num!=0){
            rev=(rev*10)+(num%10);
            num/=10;
        }
        if(rev==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
