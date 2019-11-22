/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
public class Teacher extends Employee{
private String name;
public Teacher (int id,String designation,String name){
    super (id,designation);
    this.name=name;
}
public void display(){
super.display();
System.out.println("Name=" +name);
}
public static void main (String[]args){
Employee E;
Teacher T = new Teacher ( 10989 ," Teacher", "Nabil");
T.display();
}
}

