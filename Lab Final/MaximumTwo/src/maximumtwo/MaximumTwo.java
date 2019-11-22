
package maximumtwo;

import java.util.Scanner;

public class MaximumTwo {

    
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num1=scanf.nextInt();
        int num2=scanf.nextInt();
        if(num1>num2){
            System.out.println(num1+" is maximum");
        }
        else if(num2>num1){
            System.out.println(num2+" is maximum");
        }
        else{
            System.out.println("Both are equal");
        }
    }
    
}
