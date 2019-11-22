
package productdigit;

import java.util.Scanner;

public class ProductDigit {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        int product=1;
        while(num!=0){
            product*=num%10;
            num/=10;
        }
        System.out.println(product);
    }
    
}
