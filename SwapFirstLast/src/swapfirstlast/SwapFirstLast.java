
package swapfirstlast;

import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        int firstdigit,lastdigit,temp,swap,rev=0,n;
        temp=num;
        firstdigit=num;
        while(firstdigit>=10){
            firstdigit/=10;
        }
        lastdigit=num%10;
        n=temp/10;
        while(n>=10){
            rev=(rev*10)+(n%10);
            n/=10;
        }
        swap=lastdigit;
        while(rev>0){
            swap=(swap*10)+(rev%10);
            rev/=10;
        }
        swap=swap*10+firstdigit;
        System.out.println("After Swapping : ");
        System.out.println(swap);
    }
    
}
