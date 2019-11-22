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
public class prime {
    public static void main(String[]args){
        
    
    int num,isPrime;
    isPrime=1;
    Scanner scanf= new Scanner(System.in);
    num = scanf.nextInt();
    
    for(int i=2;i<num/2;i++)
    {
        if(num%i==0)
        {
            isPrime=0;
            break;
        }
            
    }
    if(isPrime==1)
        System.out.println("The number is prime");
    else
        System.out.println("The number is not prime ");
        
    
    
}
}
