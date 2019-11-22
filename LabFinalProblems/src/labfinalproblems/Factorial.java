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
public class Factorial {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
