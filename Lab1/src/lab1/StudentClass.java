/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author hp
 */
public class StudentClass {
   String name,id;
   int age;

   
   StudentClass(String name,String id,int age){
       this.name=name;
      this.id=id;
      this.age=age;
   }
   public void display(){
       System.out.println("Name: "+name);
       System.out.println("Id: "+id);
       System.out.println("Age; "+age);

   }
    
}
