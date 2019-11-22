
package labfinalproblems;

import java.util.Scanner;


public class Maximum {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanf=new Scanner(System.in);
        a=scanf.nextInt();
        b=scanf.nextInt();
        c=scanf.nextInt();
        if (a>b && a>c){
            System.out.println("Maximum number: "+a);
        }
        else if(b>a && b>c){
            System.out.println("Maximum number: "+b);
        }
        else if(c>a && c>b){
            System.out.println("Maximum number:"+c);
        }
        
    }
    
}
