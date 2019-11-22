
package labfinalproblems;

import java.util.Scanner;

public class Pallidrome {
    public static void main(String[] args) {
        int n,num,rev=0;
        Scanner scanf=new Scanner(System.in);
        n=scanf.nextInt();
        num=n;
        while(n!=0){
            rev=(rev*10)+(n%10);
            n/=10;
        }
        if(rev==num){
            System.out.println("Pallindrome");
        }
        else
            System.out.println("Not pallindrome");
        
    }
    
}
