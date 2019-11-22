/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatype;
import java.util.Scanner;
public class DataType {

    
   
    public static void main(String[] args) { 

        
        Scanner input =new Scanner (System.in);
        System.out.println("Input Celsius Value: ");
        double celsius = input.nextDouble();
        double farenheit= (celsius*(9/5))+32;
        System.out.println("Farhenheit value is: "+farenheit);
        // TODO code application logic here
    }
    
}
