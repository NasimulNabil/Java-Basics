
package maximumthree;

import java.util.Scanner;

public class MaximumThree {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num1=scanf.nextInt();
        int num2=scanf.nextInt();
        int num3=scanf.nextInt();
        if((num1>num2)&&(num1>num3)){
            System.out.println(num1+" is maximum");
        }
        else if((num2>num1)&&(num2>num3)){
            System.out.println(num2+" is maximum");
        }
        else{
            System.out.println(num3+" is maximum");
        }
    }
    
}
