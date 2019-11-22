/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;


public class Employee {
    protected int id;
    protected String designation;
    public Employee (int id,String designation){
        this.id=id;
        this.designation=designation;
    }
    public void display(){
        System.out.println("ID="+ id +"Designation=" + designation);
    }
    
}
