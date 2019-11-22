
package labfinalproblems;

import java.util.Scanner;


public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner scanf=new Scanner(System.in);
        year=scanf.nextInt();
        if(year%4==0 && year%100!=0|| year%400==0)
        {
            System.out.println("Leap year");
        }
        else 
            System.out.println("Common Year");
    }
    
}
