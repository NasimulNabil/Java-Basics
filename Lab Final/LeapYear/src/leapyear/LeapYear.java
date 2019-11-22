
package leapyear;

import java.util.Scanner;

public class LeapYear {

    
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int year=scanf.nextInt();
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }
    }
    
}
