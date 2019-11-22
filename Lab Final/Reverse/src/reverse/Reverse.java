
package reverse;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        int reverse=0;
        while(num!=0){
            reverse=(reverse*10)+(num%10);
            num/=10;
        }
        System.out.println(reverse);
    }
    
}
