
package firstlastdigit;

import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        int firstdigit,lastdigit;
        firstdigit=num;
        while(firstdigit>=10){
            firstdigit/=10;
        }
        lastdigit=num%10;
        System.out.println("First Digit = "+firstdigit);
        System.out.println("Last Digit = "+lastdigit);
        
    }
    
}
