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
public class LoopProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,sum=0;
        Scanner input=new Scanner (System.in);
       n =input.nextInt();
        for(int i=1;i<=n;i++)
        {
           sum= sum+i;
            
        }
        System.out.println("Sum: " +sum);
        // TODO code application logic here
    }
    
}
