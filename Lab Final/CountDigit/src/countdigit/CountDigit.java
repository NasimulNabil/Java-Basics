
package countdigit;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        int count=0;
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        while(num!=0){
            count++;
            num/=10;
        }
        System.out.println(count);
    }
    
}
