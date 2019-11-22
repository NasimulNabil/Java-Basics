/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labfinalproblems;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Reverse {
    public static void main(String[] args) {
        int num,rev=0;
        Scanner scanf=new Scanner(System.in);
        num=scanf.nextInt();
        while(num!=0){
            rev=(rev*10)+(num%10);
            num/=10;
        }
        System.out.println(rev);
    }
       
    
}
