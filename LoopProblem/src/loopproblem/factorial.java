/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopproblem;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class factorial {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num;
        int fact =1;
        System.out.print("Enter a positive Number: ");
        num = input.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial: "+fact);
    }
    
}
