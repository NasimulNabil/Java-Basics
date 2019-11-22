
package labfinalproblems;

import java.util.Scanner;

public class Swap1stLast {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        int fd,ld,temp,swap,rev=0,n;
        temp=num;
        fd=num;
        while(fd>=10){
            fd/=10;
        }
        ld=num%10;
        n=temp/10;
        while(n>=10){
            rev=(rev*10)+(n%10);
            n/=10;
        }
        swap=ld;
        while(rev>0){
            swap=(swap*10)+(rev%10);
            rev/=10;
        }
        swap=swap*10+fd;
        System.out.println(swap);
        
        
            
        
    }
}
