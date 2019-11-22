
package palindromearray;

import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        int count=0,flag=0;
        int a[]=new int[10];
        Scanner scanf=new Scanner(System.in);
        int n=scanf.nextInt();
        while(n!=0){
            a[count++]=n%10;
            n/=10;
        }
        for(int i=0;i<10/2;i++){
            for(int j=a[i]-1;j>=0;j--){
                flag=0;
                if(a[i]==a[j]){
                    flag=1;
                }
            }
        }
        if(flag==1){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    
}
