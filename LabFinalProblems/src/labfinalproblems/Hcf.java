
package labfinalproblems;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        int hcf=1;
        Scanner scanf=new Scanner(System.in);
        int n1=scanf.nextInt();
        int n2=scanf.nextInt();
        int min=(n1>n2)?n1:n2;
        for(int i=1;i<=min;i++){
            if((n1%i==0)&&(n2%i==0)){
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
    
}
