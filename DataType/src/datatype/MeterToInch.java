
package datatype;

import java.util.Scanner;

public class MeterToInch {
  public static void main (String[]args){
      
      Scanner input =new Scanner (System.in);
      System.out.println("Enter a value in  inch: ");
      double inch = input.nextDouble();
      double meter = inch*0.0254;
      System.out.println("Value in meter: "+meter);
      
      
  }   
    
}
