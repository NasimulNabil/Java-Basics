/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrray;
import java.util.Scanner;


public class average {
    public static void main(String[]args){
        int[] numbers= new int[]{20,35,98,76,65,88};
        int sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            sum =sum+numbers[i];
        }
        double average=sum/numbers.length;
        System.out.println("Average value is:"+average);
    }
}
