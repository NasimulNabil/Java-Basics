/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;


public class NewClass {
    public static void main(String[] args) {
        int x=10,y=0;
        try{
            System.out.println((x/y));
    }
        catch(Exception e){
            //System.out.println(e);
            e.printStackTrace();
        }
      finally{ System.out.println("done");}
    
    }
}
