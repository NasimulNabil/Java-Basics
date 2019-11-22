
package lcm;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int lcm=1;
        Scanner scanf=new Scanner(System.in);
        int n1=scanf.nextInt();
        int n2=scanf.nextInt();
        int max=(n1>n2)?n1:n2;
        int i=max;
        while(i!=0){
            if((i%n1==0)&&(i%n2==0)){
                lcm=i;
                break;
            }
            i+=max;
        }
        System.out.println(lcm);
    }
    
}
