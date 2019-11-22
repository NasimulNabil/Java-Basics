
package frequency;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        int count=0;
        int a[]=new int[10];
        Scanner scanf=new Scanner(System.in);
        int n=scanf.nextInt();
        for(int i=0;i<10;i++){
            a[i]=0;
        }
        while(n!=0){
            count=n%10;
            n/=10;
            a[count]++;
        }
        for(int i=0;i<10;i++){
            System.out.printf("Frequency of %d = %d",i,a[i]);
            System.out.print("\n");
        }
        
    }
    
}
