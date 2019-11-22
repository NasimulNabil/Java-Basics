/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatype;
import java.util.Scanner;

/**
 *
 * @aut
 */
public class minToYear {
    public static void main (String[]args){
            double minutesInYear=60*24*365;
        Scanner input=new Scanner(System.in);
        double min=input.nextDouble();
        long years= (long) (min/minutesInYear);
        int days= (int)(min/60/24)%365;
        System.out.print((int) min+ " minute"
                + " =" + years + " years and " + days + " days");
        
    }
    
}
