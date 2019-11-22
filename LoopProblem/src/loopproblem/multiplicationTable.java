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
public class multiplicationTable {
    public static void main(String[]args){
        Scanner console = new Scanner(System.in);
        int num;
        System.out.println("Enter an positive integer ; ");
        num = console.nextInt();
        System.out.println("Multiplication Table of "  +num);
        for(int i=1;i<=10;i++)
        {
            System.out.println(num + "*" +i+ "=" +(num*i));
        }
    }
    
}
